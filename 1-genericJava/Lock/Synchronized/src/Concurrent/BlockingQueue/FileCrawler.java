package Concurrent.BlockingQueue;

import java.io.File;
import java.util.concurrent.BlockingQueue;


//生产者任务，在某个文件层次结构中搜索符合索引标准的文件，并将它们放入工作队列
class FileCrawler implements Runnable {
    private final BlockingQueue<File> fileQueue;
    private final File root;

    public FileCrawler(BlockingQueue<File> fileQueue, File root) {
        this.fileQueue = fileQueue;

        this.root = root;

    }

    @Override
    public void run() {
        try {
            crawl(root);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void crawl(File root) throws InterruptedException {
        File[] entries = root.listFiles();
        if (entries != null) {
            for (File entrie : entries) {
                if (entrie.isDirectory()) {
                    crawl(entrie);
                } else {
                    if (!alreadyIndexed(entrie)) {
                        System.out.println("放入生产者队列文件：" + entrie.getName() + "来自线程：" + Thread.currentThread().getName());
//                        fileQueue.add(entrie);
                        fileQueue.put(entrie);
                    }

                }
            }
        }
    }

    private boolean alreadyIndexed(File entrie) {
        return false;
    }
}
