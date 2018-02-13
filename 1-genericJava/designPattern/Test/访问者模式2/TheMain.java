package Test.访问者模式2;

import java.util.ArrayList;
import java.util.List;

public class TheMain {
    static Manager liaoba;
    static  CommonEmployee ce;

    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.print(new Policy1(), "");
        }
        System.out.println("\n============== policy base ==================\n");
//        PolicyBase policy_base = new PolicyBase();
//        liaoba.print(policy_base, "");
//        liaoba.print(policy_passSelf, "getUnderling");



        System.out.println("\n============== policy1 ==================\n");
        System.out.println();
        Policy1 policy_passSelf = new Policy1();
        System.out.println(liaoba.name + "的天下-----------");
        liaoba.print(policy_passSelf, "");
        liaoba.print(policy_passSelf, "getUnderling");
        //wangwu.getUnderling();
        System.out.println("\nover-----------");

        ce.print(policy_passSelf, "");
    }

    //模拟出公司的人员情况,我们可以想象这个数据是通过持久层传递过来的
    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();
        CommonEmployee zhangsan = new CommonEmployee("张三", 1800, "编写Java程序,绝对的蓝领、苦工加搬运工");
        CommonEmployee lisi = new CommonEmployee("李四", 1900, "页面美工,审美素质太不流行了!");
        Manager wangwu = new Manager("王五", 18750, "基本上是负值,但是我会拍马屁呀");

        empList.add(zhangsan);
        empList.add(lisi);
        empList.add(wangwu);
        wangwu.addEmployee(zhangsan);
        wangwu.addEmployee(lisi);

        CommonEmployee liuliu = ce = new CommonEmployee("刘六", 1900, "页面美工,审美素质太不流行了!");
        CommonEmployee chenqi = new CommonEmployee("陈七", 1900, "页面美工,审美素质太不流行了!");
        liaoba = new Manager("廖八", 1900, "基本上是负值,审美素质太不流行了!");

        empList.add(liuliu);
        empList.add(chenqi);
        empList.add(liaoba);
        liaoba.addEmployee(liuliu);
        liaoba.addEmployee(chenqi);

        return empList;
    }
}
