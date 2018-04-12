package Concurrent.Test;

import java.util.ArrayList;
import java.util.List;

public class TheMain1 {
    public static void main(String[] args) {
        List<String> newList = new ArrayList<>();
        newList.add("a");
        newList.add("b");
        newList.add("c");
        String[] a = newList.toArray(new String[newList.size()]);
        for (String s : a) {
            System.out.println(s);
        }
    }
}
