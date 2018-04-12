package Concurrent.SequenceNumber.Concurrent;

public class TheMain {
    public static void main(String[] args) {

        SequenceNumber sn = new SequenceNumber();
        //③ 3个线程共享sn，各自产生序列号
        TestClient t1 = new TestClient(sn, 2);
        TestClient t2 = new TestClient(sn, 3);
        TestClient t3 = new TestClient(sn, 4);
        t1.start();
        t2.start();
        t3.start();
    }
}

class SequenceNumber {
    //①通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
    private static ThreadLocal<Integer> seqNum = ThreadLocal.withInitial(() -> 0);

    //②获取下一个序列值
    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }
}

class TestClient extends Thread {
    private SequenceNumber sn;
    private int max;

    public TestClient(SequenceNumber sn, int max) {
        this.sn = sn;
        this.max = max;
    }

    @Override
    public void run() {
        //④每个线程打出3个序列值
        for (int i = 0; i < max; i++) {
            System.out.println("thread[" + Thread.currentThread().getName() + "] sn[" + sn.getNextNum() + "]");
        }
    }
}