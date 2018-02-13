package 中介者模式.中介者模式3;

public class Stock extends AbstractColleague {
    static int mCount = 100;

    Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    public int getCount() {
        return mCount;
    }

    public void increase(int num) {
        mCount += num;
        System.out.println("购入"+ num +"后库存合计为 " + mCount);
    }

    public void decrease(int num) {
        mCount -= num;
        System.out.println("提取"+ num +"后库存合计为 " + mCount);
    }
}