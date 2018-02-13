package 责任链模式.责任链模式2;

import java.util.ArrayList;
import java.util.Random;

public class TheMain {
    public static void main(String[] args) throws Exception {
//随机挑选几个女性
        ArrayList<IWomen> arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(new Random().nextInt(3) + 1, "我要出去逛街"));
        }
//定义三个请示对象

        IHandler husband = new Husband("丈夫");
        IHandler father = new Father("父亲");
        IHandler son = new Son("儿子");
//        father.setNextHandler(son);
//        son.setNextHandler(husband);

        for (IWomen women : arrayList) {
            int type = women.getType();
            System.out.println((type == 1 ? "女儿(1)" : (type == 2 ? "妻子(2)" : "母亲(3)")) + "的请示是:" + women.getRequest());
            father.handleMessage(women);
            System.out.println("----------------------");
        }
    }
}
