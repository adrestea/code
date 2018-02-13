package Test.访问者模式2;

public class CommonEmployee extends Employee {
    private String job = "";

    public CommonEmployee(String _name, int _salary, String _job) {
        super(_name, _salary);
        job = _job;
    }

    @Override
    void print(IVistor1 vistor, String command) {
        vistor.vistCommonEmployee(this);
    }

    public void getJob() {
        System.out.print("\tJob:" + job);
    }
}
