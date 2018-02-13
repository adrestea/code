package 责任链模式.责任链模式2;

public class Father extends IHandler {
    public Father(String _name) {
        super(_name);
    }

    @Override
    protected int favFlag() {
        return 1;
    }

    @Override
    public void handle(IWomen women) {
        System.out.println("女儿的请示是:" + women.getRequest());
        System.out.println("父亲的答复是:同意");
    }
}