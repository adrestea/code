import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class TheMain {
    static int val = -1;

    public static void main(String[] args) {

        Object o = new Object();
        Semaphore mSem = new Semaphore(0);

        Thread ma = new Thread(() -> {
            try {
                synchronized (o) {
                    mSem.tryAcquire(1, TimeUnit.SECONDS);
                    System.out.println("ma beginning....");
                    if (val == -1) {
                        System.out.println("ma wait.");
                        o.wait(1);
                    }
                    System.out.println("val = " + val);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t = new Thread(() -> {
            synchronized (o) {
                System.out.println("t beginning....");
                try {
                    Thread.sleep(3500);
                    val = 1;
                    System.out.println("t notify....");
                    o.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    return;
                }
            }
        });

        ma.start();
        t.start();
    }
}
