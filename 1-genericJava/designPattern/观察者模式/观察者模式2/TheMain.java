package 观察者模式.观察者模式2;

import java.util.Observer;

/**
 * 该实现是直接引入java sdk的Observer接口实现
 */

public class TheMain {
    public static void main(String[] args) throws InterruptedException {
//定义出韩非子和李斯
        HanFeiZi hanFeiZi = new HanFeiZi();
//开始启动线程,监控
        Observer lisi = new Lisi();

        hanFeiZi.addObserver(lisi);

        Thread.sleep(1000); //主线程等待1秒后后再往下执行
        hanFeiZi.haveBreakfast();
//韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}