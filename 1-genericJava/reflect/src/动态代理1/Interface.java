package 动态代理1;

public interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {
    public void doSomething() {
        System.out.println("doSomething.");
    }

    public void somethingElse(String arg) {
        System.out.println("somethingElse " + arg);
    }
}