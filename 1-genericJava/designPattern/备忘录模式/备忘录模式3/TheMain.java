package 备忘录模式.备忘录模式3;
/**
 * 创建备忘可以通过本例的实现Cloneable接口， 或者是通过json/Parcelabe接口等方法保存对象然后恢复
 * */
public class TheMain {
    public static void main(String[] args) {
//定义发起人
        Originator originator = new Originator();
//建立初始状态
        originator.setState("初始状态...");
        System.out.println("初始状态是:" + originator.getState());

        originator.setState("第一次变形后状态...");
        System.out.println("变化后状态是:" + originator.getState());

//建立备份
        originator.createMemento();
        System.out.println("-------> 这里创建恢复记录 < -------------，状态为：" + originator.getState());

//修改状态
        originator.setState("修改后的状态...");
        System.out.println("修改后状态是:" + originator.getState());
//恢复原有状态
        originator.restoreMemento();
        System.out.println("-------> 这里开始恢复 < -------------");

        System.out.println("恢复后状态是:" + originator.getState());
    }
}
