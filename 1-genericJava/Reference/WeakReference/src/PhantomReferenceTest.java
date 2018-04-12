import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Field;
import java.util.Date;

// 当PhantomReference加入到ReferenceQueue的时候,目标对象内存空间仍然存在不会被回收.
// PhantomReference中的referent字段不会被JVM自动设置成null
// 当目标对象的PhantomReference加入到ReferenceQueue的时,此时目标对象是强可达的
public class PhantomReferenceTest {
    private static volatile boolean isRun = true;

    private static volatile ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();

    public static void main(String[] args) throws Exception {
        String abc = new String("abc");
        System.out.println(abc.getClass() + "@" + abc.hashCode());

        new Thread(() -> {
            while (isRun) {
//                System.out.println("before:  " + new Date());
                Object o = referenceQueue.poll();
                if (o != null) {
                    System.out.println("after:  " + new Date() + "    Object o = " + o);
                    try {
                        Field rereferent = Reference.class.getDeclaredField("referent");
                        rereferent.setAccessible(true);
                        Object result = rereferent.get(o);
                        System.out.println("gc will collect:" + result.getClass() + "@" + result.hashCode());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        // 测试情况1:对象是虚可达的
        PhantomReference<String> phantom = new PhantomReference<>(abc, referenceQueue);
        System.out.println("phantom=" + phantom);

        // 测试情况2:对象是不可达的,直接就被回收了,不会加入到引用队列
        // new PhantomReference<String>(abc, referenceQueue);

        // 清除强引用,触发GC
        abc = null;
        System.gc();

        Thread.sleep(3000);
        isRun = false;
    }
}
