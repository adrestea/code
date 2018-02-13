package 代理模式.代理模式5之动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIHandler implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;

    //我要代理谁
    public GamePlayIHandler(Object _obj) {
        this.obj = _obj;
    }

    //调用被代理的方法
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("GamePlayIHandler---> method:" + method.getName());
        Object result = method.invoke(this.obj, args);
        return result;
    }
}