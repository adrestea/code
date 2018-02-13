package 备忘录模式.备忘录模式5;

/**
 * ***多备份的备忘录***
 */
public class TheMain {
    public static void main(String[] args) {
//定义出发起人
        Originator originator = new Originator();
//定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        originator.setState("1111111");
        System.out.println("1111111-------------->" + originator.getState());
        caretaker.setMemento("001", originator.createMemento());

//创建备忘录
        originator.setState("2222222");
        System.out.println("22222222-------------->" + originator.getState());

        caretaker.setMemento("002", originator.createMemento());

        originator.setState("333333");
        System.out.println("333333-------------->" + originator.getState());

//恢复一个指定标记的备忘录
        String restoreKey = "002";
        originator.restoreMemento(caretaker.getMemento(restoreKey));
        System.out.println("恢复 " + restoreKey + "号备份，-------------->" + originator.getState());
    }
}