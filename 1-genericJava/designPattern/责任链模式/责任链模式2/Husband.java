package 责任链模式.责任链模式2;

public class Husband extends IHandler {
    public Husband(String _name) {
        super(_name);
    }

    @Override
    protected int favFlag() {
        return 2;
    }

    @Override
    public void handle(IWomen women) {
        System.out.println("妻子的请示是:" + women.getRequest());
        System.out.println("丈夫的答复是:同意");
    }
}