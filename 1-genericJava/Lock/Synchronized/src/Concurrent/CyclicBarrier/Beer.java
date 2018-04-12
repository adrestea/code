package Concurrent.CyclicBarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: Beer
 * 有五个人参与跑步，规定五个人只要都跑到终点了，大家可以喝啤酒。但是，只要有一个人没到终点，就不能喝。 这里没有要求大家要同时起跑
 * 注意:当线程数大于或者小于CyclicBarrier的count数时候都会导致barrier.await(5, TimeUnit.SECONDS)发生超时异常
 */
public class Beer {
    public static void main(String[] args) {
        final int count = 5;
        final CyclicBarrier barrier = new CyclicBarrier(count, () -> System.out.println("drink beer!"));

        for (int i = 0; i < count; i++) {
            new Thread(new Worker(i + 1, barrier)).start();
        }
    }
}
