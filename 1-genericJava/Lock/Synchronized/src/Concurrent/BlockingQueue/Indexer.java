package Concurrent.BlockingQueue;

import java.io.File;
import java.util.concurrent.BlockingQueue;


//消费者
class Indexer implements Runnable {
    private final BlockingQueue<File> queue;

    public Indexer(BlockingQueue<File> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                indexFile(queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void indexFile(File file) {
        System.out.println("消费者取出文件：" + file.getName() + " 来自线程：" + Thread.currentThread().getName());
    }
}
