package SynchronizedTest;

import java.util.Date;

public class SynchronizedTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int times = 5;
                while (times-- > 0) {
                    synchronized (this) {
                        try {
                            Thread.sleep(3000);
                            System.out.println(new Date() + "    :aaa");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("    :bbb");
                }
            }
        }).start();
    }
}
