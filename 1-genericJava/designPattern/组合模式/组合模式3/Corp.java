package 组合模式.组合模式3;

abstract class Corp {
    //小兵也有名称
    private String name = "";
    //小兵也有职位
    private String position = "";
    //小兵也有薪水,否则谁给你干
    private int salary = 0;

    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    //每个员工都有信息,你想隐藏,门儿都没有!
    public String getInfo() {
        String info = "";
        info = "姓名:" + this.name;
        info = info + "\t职位:" + this.position;
        info = info + "\t薪水:" + this.salary;
        return info;
    }
}