package Test.访问者模式2;

public class PolicyBase implements IVistorBase {
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
}