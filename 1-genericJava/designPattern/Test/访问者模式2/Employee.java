package Test.访问者模式2;

abstract class Employee {
    String name;
    int salary;

    public Employee(String _name, int _salary) {
        this.name = _name;
        this.salary = _salary;
    }

    public void getBaseInfo() {
        System.out.print("\nName:" + this.name + "\tSalary:" + salary);
    }

    abstract void print(IVistor1 vistor, String command);
}