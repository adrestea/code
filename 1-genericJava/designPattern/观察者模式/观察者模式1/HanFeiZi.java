package 观察者模式.观察者模式1;

import java.util.ArrayList;

public class HanFeiZi implements IHanFeiZi, IObserver {
    private ArrayList<IObserver> observers = new ArrayList<>();
    //韩非子是否在吃饭,作为监控的判断标准
    private boolean isHavingBreakfast = false;
    //韩非子是否在娱乐
    private boolean isHavingFun = false;

    //韩非子要吃饭了
    public void haveBreakfast() {
        System.out.println("韩非子:我开始吃饭了...");
        this.isHavingBreakfast = true;
        notifyObservers("李斯： 韩非子开始吃饭了");
    }

    //韩非子开始娱乐了
    public void haveFun() {
        System.out.println("韩非子:开始娱乐了...");
        this.isHavingFun = true;
        notifyObservers("李斯： 韩非子开始娱乐了");
    }

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    public void deleteObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {

        for (IObserver obs : observers) {
            obs.notifyObservers(context);
        }
    }
}
