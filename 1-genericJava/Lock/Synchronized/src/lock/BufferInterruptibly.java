package lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用Reentrantlock的时候, 如果有线程等待在lockInterruptible()方法时候调用interrupt是会响应的,
 * 但是如果已经过了这个点那么就不会响应中断
 */
public class BufferInterruptibly implements IBuffer {

    private ReentrantLock lock = new ReentrantLock();

    public void write() {
        lock.lock();
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("开始往这个buff写入数据…");
            for (; ; )// 模拟要处理很长时间
            {
                if (System.currentTimeMillis() - startTime > 8000)
                    break;
            }
            System.out.println("终于写完了");
        } finally {
            lock.unlock();
        }
    }

    public void read() throws InterruptedException {
        lock.lockInterruptibly();// 注意这里，可以响应中断. 如果过了这个点则不会响应
        try {
            System.out.println("从这个buff读数据");
        } finally {
            lock.unlock();
        }
    }

}