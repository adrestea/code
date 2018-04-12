package ProducerConsumer;

import java.util.Random;

public class ProducerConsumerInJava2 {


    static int currentCount = 0;
    static int times = 10;

    public static void main(String args[]) {
        System.out.println("How to use wait and notify method in Java");
        System.out.println("Solving Producer Consumer Problem");
        int maxSize = 10;
        Object o_producer = new Object();
        Object o_consumer = new Object();
        Thread producer = new Producer(maxSize, "PRODUCER", o_producer, o_consumer);
        Thread consumer = new Consumer(maxSize, "CONSUMER", o_producer, o_consumer);
        producer.start();
        consumer.start();

    }

    static class Producer extends Thread {
        private int maxSize;
        private Object o_producer;
        private Object o_consumer;

        public Producer(int maxSize, String name, Object o_producer, Object o_consumer) {
            super(name);
            this.maxSize = maxSize;
            this.o_producer = o_producer;
            this.o_consumer = o_consumer;
        }

        @Override
        public void run() {
            while (true) {
                if (times-- == 0)
                    break;
                Random random = new Random();
                int i = random.nextInt(maxSize - 1) + 1;
                System.out.println(getName() + "    已经生产出 " + i + " , 等待入库.");

                try {
                    currentCount += i;
                    System.out.println(getName() + "    入庫成功,可以消費, 當前总个数为: " + currentCount);
                    if (currentCount > 0) {
                        System.out.println(getName() + "    仓库有库存,通知消费");
                        Thread.sleep(2000);
                        synchronized (o_consumer) {
                            o_consumer.notify();
                        }
                    } else {
                        continue;
                    }
                    if (currentCount >= maxSize) {
                        synchronized (o_producer) {
                            o_producer.wait();
                        }
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    static class Consumer extends Thread {
        private int maxSize;
        private Object o_producer;
        private Object o_consumer;

        public Consumer(int maxSize, String name, Object o_producer, Object o_consumer) {
            super(name);
            this.maxSize = maxSize;
            this.o_producer = o_producer;
            this.o_consumer = o_consumer;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    if (times == 0)
                        break;
                    Random random = new Random();
                    int i = random.nextInt(maxSize - 1) + 1;
                    System.out.println(getName() + " -->   消费者需要 " + i + " 个产品, 当前产品总数为: " + currentCount);
                    while (currentCount < i) {
                        System.out.println(getName() + " -->   生产个数不够, 等待产出");
                        System.out.println(getName() + " -->   消费者需要消费: " + i + " 个产品. 剩余:" + currentCount);
                        synchronized (o_consumer) {
                            o_consumer.wait();
                        }
                        Thread.sleep(1000);
                    }
                    currentCount -= i;
                    System.out.println(getName() + " -->   消费者消费成功 " + i + " 个产品, 当前产品剩余: " + currentCount);
                    synchronized (o_producer) {
                        o_producer.notify();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



