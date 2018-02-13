package 策略模式.策略枚举1;

/**
 * 策略枚举模式将所有的实施策略合接口包含在一个枚举类中，简洁方便。
 * */

import java.util.Arrays;

public class TheMain {
    public static void main(String[] args) {
//输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1]; //符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为:" + Arrays.toString(args));
        System.out.println("运行结果为:" + a + symbol + b + "=" + Calculator.add.exec(a, b));
    }
}
