package Test.访问者模式2;

public class Policy1 implements IVistor1 {
    @Override
    public void vistManager(Manager manager) {
        manager.getBaseInfo();
        manager.getPerformance();
    }

    @Override
    public void vistCommonEmployee(CommonEmployee commonEmployee) {
        commonEmployee.getBaseInfo();
        commonEmployee.getJob();
    }

    @Override
    public void vistUnderling(Manager manager) {
        manager.getUnderling();
    }
}