package 观察者模式.观察者模式1;

public class WangSi implements IObserver {

    //一看韩非子有活动,他就痛哭
    private void cry(String context) {
        System.out.println("王斯:因为" + context + ",--所以我悲伤呀!");
    }

    //王斯,看到韩非子有活动
    @Override
    public void notifyObservers(String context) {
        System.out.println("王斯:观察到韩非子活动,自己也开始活动了...");
        this.cry(context);
        System.out.println("王斯:哭死了...\n");
    }
}
