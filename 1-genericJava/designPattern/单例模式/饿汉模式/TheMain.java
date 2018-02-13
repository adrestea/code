package 单例模式.饿汉模式;

public class TheMain {
    public static void main(String[] args) {
        Singleton.getSingleton().call();
        Singleton.getSingleton().call();
        Singleton.getSingleton().call();
    }
}