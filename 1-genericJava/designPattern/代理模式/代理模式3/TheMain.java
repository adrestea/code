package 代理模式.代理模式3;

/*
 *强制代理之用户创建代理
 */
public class TheMain {

    public static void main(String[] args) {
//定义一个游戏的角色
//获得指定的代理
        IGamePlayer proxy = new GamePlayer("张三").getProxy();
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