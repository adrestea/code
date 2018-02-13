package 组合模式.组合模式3;

public class Leaf extends Corp {
    //通过一个构造函数传递小兵的信息
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}