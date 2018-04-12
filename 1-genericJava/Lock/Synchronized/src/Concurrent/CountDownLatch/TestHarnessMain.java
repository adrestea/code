package Concurrent.CountDownLatch;

public class TestHarnessMain {

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("执行任务，我是线程：" + Thread.currentThread().getName());
        int count = 10;
        TestHarness testHarness = new TestHarness(count, task);
        long time = testHarness.timeTask();
        System.out.println("闭锁  测试结果  执行" + count + "个线程" + " 一共用时：" + time);
    }
}
