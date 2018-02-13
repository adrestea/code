package Test.访问者模式2;

import java.util.ArrayList;

public class Manager extends Employee {
    private String performance;

    public Manager(String _name, int _salary, String _performance) {
        super(_name, _salary);
        performance = _performance;
        mans.clear();
    }

    @Override
    void print(IVistor1 vistor, String command) {
        switch (command) {
            case "":
                vistor.vistManager(this);
                break;
            case "getUnderling":
                vistor.vistUnderling(this);
                break;
        }
    }

    private ArrayList<Employee> mans = new ArrayList<>();

    public void addEmployee(CommonEmployee ce) {
        mans.add(ce);
    }

    public void getPerformance() {
        System.out.print("\tPerformance:" + performance);
    }

    public void getUnderling() {
        for (Employee e : mans) {
            e.getBaseInfo();
            if (e instanceof CommonEmployee) {
                ((CommonEmployee) e).getJob();
            } else if (e instanceof Manager) {
                ((Manager) e).getPerformance();
            }
        }
    }
}