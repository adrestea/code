package Concurrent.BlockingQueue;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Throws   exception	Special     value	        Blocks	Times out
 * Insert	add(e)	    offer(e)	put(e)	        offer(e, time, unit)
 * Remove	remove()	poll()	    take()	        poll(time, unit)
 * Examine	element()	peek()	    not applicable	not applicable
 */

public class TheMain {

    public static void main(String[] args) {

        File file = new File("/home/archermind/archermind");
        File[] roots = file.listFiles();
        final int BOUND = 10;
        final int N_CONSUMERS = Runtime.getRuntime().availableProcessors();
        BlockingQueue<File> queue = new LinkedBlockingQueue<>(BOUND);

        //消费
        for (int i = 0; i < N_CONSUMERS; i++) {
            new Thread(new Indexer(queue)).start();
        }
        //生产
        for (File root : roots) {
            new Thread(new FileCrawler(queue, root)).start();
        }
    }

}
