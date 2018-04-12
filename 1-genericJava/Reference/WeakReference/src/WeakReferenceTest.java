import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// 会报空指针:WeakReference中的referent被设置成null,之后加入到ReferenceQueue
public class WeakReferenceTest {
    private static volatile boolean isRun = true;

    private static volatile ReferenceQueue<String> referenceQueue = new ReferenceQueue<>();

    public static void main(String[] args) throws Exception {
        String abc = new String("abc");
        System.out.println(abc.getClass() + "@" + abc.hashCode());

        new Thread(() -> {
            while (isRun) {
                Object o = referenceQueue.poll();
                if (o != null) {
                    try {
                        Field rereferent = Reference.class
                                .getDeclaredField("referent");
                        rereferent.setAccessible(true);
                        Object result = rereferent.get(o);
                        System.out.println("gc will collect:"
                                + result.getClass() + "@"
                                + result.hashCode());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        // 对象是弱可达的
        WeakReference<String> weak = new WeakReference<>(abc, referenceQueue);
        System.out.println("weak=" + weak);

        // 清除强引用,触发GC
        abc = null;
        System.gc();

        Thread.sleep(3000);
        isRun = false;
    }
}
