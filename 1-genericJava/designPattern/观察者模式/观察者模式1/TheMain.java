package 观察者模式.观察者模式1;

public class TheMain {
    public static void main(String[] args) throws InterruptedException {
//定义出韩非子和李斯
        HanFeiZi hanFeiZi = new HanFeiZi();
//开始启动线程,监控
        IObserver lisi = new Lisi();
        IObserver liusi = new LiuSi();
        IObserver wangsi = new WangSi();

        hanFeiZi.addObserver(lisi);
        hanFeiZi.addObserver(liusi);
        hanFeiZi.addObserver(wangsi);

        Thread.sleep(1000); //主线程等待1秒后后再往下执行
        hanFeiZi.haveBreakfast();
//韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}