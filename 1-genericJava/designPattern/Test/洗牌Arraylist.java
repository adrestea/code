package Test;

import java.util.ArrayList;
import java.util.Collections;

public class 洗牌Arraylist {
    static ArrayList<Integer> list = new ArrayList<>();
    static final int MAX = 20;

    static {
        for (int i = 0; i < MAX; i++) {
            list.add(i);
        }
    }

    public static void main(String args[]) {
        print(list);
        Collections.shuffle(list);
        System.out.println("=============================================");
        print(list);
    }

    static void print(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("------>index:" + i + " ,val:" + list.get(i));
        }
    }
}