package 单例模式.饿汉模式;

public class Singleton {
    private static Singleton singleton = new Singleton();

    //限制产生多个对象
    private Singleton() {
    }

    //通过该方法获得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    public void call() {
        System.out.println("I am called!!!\nObject is:" + singleton);
    }
}
