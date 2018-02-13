package 动态代理1;


import java.lang.reflect.Proxy;

/**
 * <<深入理解Java反射>>
 * http://www.cnblogs.com/luoxn28/p/5686794.html
 */

public class TheMain {
    public static void main(String[] args) {
        RealObject real = new RealObject();
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(), new Class[]{Interface.class},
                new DynamicProxyHandler(real));

        proxy.doSomething();
        proxy.somethingElse("luoxn28");
    }
}