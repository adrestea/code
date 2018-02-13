package 中介者模式.中介者模式3;

public abstract class AbstractMediator {
    protected Sale mSale = null;
    protected Stock mStock = null;
    protected Purchase mPurchase = null;

    AbstractMediator() {
        mSale = new Sale(this);
        mStock = new Stock(this);
        mPurchase = new Purchase(this);
    }

    abstract void execute(String str, Object... objects);

    public int getStockNumber() {
        return 0;
    }
}
