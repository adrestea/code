package lock;

public class TheMainTest {
    //是用ReentrantLock，还是用synchronized
    public static boolean useSynchronized = false;
//    public static boolean useSynchronized = true;

    public static void main(String[] args) {
        IBuffer buff;
        if (useSynchronized) {
            buff = new Buffer();
        } else {
            buff = new BufferInterruptibly();
        }
        final Writer writer = new Writer(buff);
        final Reader reader = new Reader(buff);
        writer.start();
        reader.start();
        new Thread(() -> {
            long start = System.currentTimeMillis();
            for (; ; ) {
                // 等5秒钟去中断读
                if (System.currentTimeMillis() - start > 3000) {
                    System.out.println("不等了，尝试中断");
//                    writer.interrupt();
                    reader.interrupt();
                    break;
                }

            }

        }).start();
    }
}

class Writer extends Thread {
    private IBuffer buff;

    public Writer(IBuffer buff) {
        this.buff = buff;
    }

    @Override
    public void run() {
        System.out.println("start to Writer.");
        try {
            buff.write();
        } catch (InterruptedException e) {
//            e.printStackTrace();
            System.out.println("我不写了");
        }
        System.out.println("写结束");
    }
}

class Reader extends Thread {
    private IBuffer buff;

    public Reader(IBuffer buff) {
        this.buff = buff;
    }

    @Override
    public void run() {
        System.out.println("start to Reader.");
        try {
            buff.read();
        } catch (InterruptedException e) {
            System.out.println("我不读了");
        }
        System.out.println("读结束");
    }
}
