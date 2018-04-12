package Concurrent.ConcurrentHashMap;

import java.util.HashMap;
import java.util.UUID;
/**
 * 多线程环境下，使用HashMap进行put操作会引起死循环，导致CPU利用率接近100%，所以在并发情况下不能使用HashMap
 * */

public class HashMapTest {
    public static void main(String[] args) throws InterruptedException {
        final HashMap<String, String> map = new HashMap<>(2);
        Thread t = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                new Thread(() -> {
                    map.put(UUID.randomUUID().toString(), "");
                    System.out.println(map.keySet());
                }, "ftf" + i).start();
            }
        }, "ftf");
        t.start();
        t.join();
        System.out.println("over");
    }
}
