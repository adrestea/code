package 代理模式.代理模式2;

/*
 *将GamePlayer构造函数私有化隐藏，仅通过代理调用
 */
public class TheMain {

    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("李四");
//开始打游戏,记下时间戳
        System.out.println("开始时间是:2009-8-25 10:45");
        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();
//记录结束游戏时间
        System.out.println("结束时间是:2009-8-26 03:40");
    }
}