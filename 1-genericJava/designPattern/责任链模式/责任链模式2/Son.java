package 责任链模式.责任链模式2;

public class Son extends IHandler {
    public Son(String _name) {
        super(_name);
    }

    @Override
    protected int favFlag() {
        return 3;
    }

    @Override
    public void handle(IWomen women) {
        System.out.println("母亲的请示是:" + women.getRequest());
        System.out.println("儿子的答复是:同意");
    }
}