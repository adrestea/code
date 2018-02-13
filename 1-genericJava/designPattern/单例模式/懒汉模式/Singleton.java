package 单例模式.懒汉模式;

public class Singleton {
    private static Singleton singleton = null;
    private final static Object syncLock = new Object();

    //限制产生多个对象
    private Singleton() {
    }

    //通过该方法获得实例对象
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (syncLock) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void call() {
        System.out.println("I am called!!!\nObject is:" + singleton);
    }
}
