package 责任链模式.责任链模式2;

public abstract class IHandler {
    String name = null;

    private static IHandler current = null;

    public IHandler(String _name) {
        this.name = _name;
        if (current != null) {
            current.setNextHandler(this);
        }
        current = this;
    }

    protected abstract int favFlag();

    protected IHandler nextHandler = null;

    //一个女性(女儿、妻子或者母亲)要求逛街,你要处理这个请求
    public void handleMessage(IWomen women) throws Exception {
        if (favFlag() == 0) {
            throw new Exception("fav flag can not be 1");
        }
        if (favFlag() == women.getType()) {
            handle(women);
        } else {
            if (this.nextHandler != null) {
                System.out.println("    " + this.name + "处理无权处理，请找>>> " + nextHandler.getName() + " <<<处理");
                this.nextHandler.handleMessage(women);
            } else { //已经没有后续处理人了,不用处理了
                System.out.println("---没地方请示了,按不同意处理---\n");
            }
        }
    }

    public abstract void handle(IWomen women);

    public void setNextHandler(IHandler _nextHandler) {
        this.nextHandler = _nextHandler;
    }

    public String getName() {
        return name;
    }
}