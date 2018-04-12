package Concurrent.Condition;

import java.util.Arrays;
import java.util.List;

public class TheMain {
    public static void main(String[] args) {
        final Business business = new Business();
        new Thread(() -> threadExecute(business, "sub")).start();
        threadExecute(business, "main");
    }

    public static void threadExecute(Business business, String threadType) {
        for (int i = 0; i < 100; i++) {
            try {
                if ("main".equals(threadType)) {
                    business.main(i);
                } else {
                    business.sub(i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
