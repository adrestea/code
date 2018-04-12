package ProducerConsumer;

import java.util.Random;

public class ProducerConsumerInJava1 {


    static int currentCount = 0;
    static int times = 10;

    public static void main(String args[]) {
        System.out.println("How to use wait and notify method in Java");
        System.out.println("Solving Producer Consumper Problem");
        int maxSize = 10;
        Object o_producer = new Object();
        Thread producer = new Producer(maxSize, "PRODUCER", o_producer);
        Thread consumer = new Consumer(maxSize, "CONSUMER", o_producer);
        producer.start();
        consumer.start();

    }

    static class Producer extends Thread {
        private int maxSize;
        private Object o;
//        private int currentCount;

        public Producer(int maxSize, String name, Object o) {
            super(name);
            this.maxSize = maxSize;
            this.o = o;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    while (true) {
                        if (times == 0)
                            break;
                        while (currentCount >= maxSize) {
                            try {
                                System.out.println(getName() + "    产品充裕, 等待消费者消费");
                                o.wait();
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                        Random random = new Random();
                        int i = random.nextInt(maxSize);
                        currentCount += i;
                        o.notifyAll();
                        System.out.println(getName() + "    生产个数为" + i + " , 产品总个数为: " + currentCount);
                    }
                }
            }
        }
    }

    static class Consumer extends Thread {
        private int maxSize;
        private Object o;

        public Consumer(int maxSize, String name, Object o) {
            super(name);
            this.maxSize = maxSize;
            this.o = o;
        }

        @Override
        public void run() {
            while (true) {
                if (times-- == 0)
                    break;
                synchronized (o) {
                    Random random = new Random();
                    int i = random.nextInt(maxSize);
                    System.out.println(getName() + "    消费者需要 " + i + " 个产品, 当前剩余: " + currentCount);
                    while (currentCount < i) {
                        System.out.println(getName() + "    生产个数不够, 等待产出");
                        try {
                            o.wait();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    }
                    currentCount -= i;
                    System.out.println(getName() + "    消费者消费: " + i + " 个产品. 剩余:" + currentCount);
                    o.notifyAll();
                }
            }
        }
    }
}



