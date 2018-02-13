package 中介者模式.中介者模式3;

import java.util.Random;

public class Sale extends AbstractColleague {
    int sellNum = 0;

    Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellComputer() {
        sell(-1);
    }

    public void sellComputer(int num) {
        sell(num);
    }

    private int sell(int num) {
        if (num <= 0) {
            num = new Random().nextInt(100);
        }
        sellNum = num;
        super.mMediator.execute("sale.sale", num);
        return num;
    }

    public int getSellNum() {
        return sellNum;
    }

    public void offAction() {
        System.out.println("折扣扫货...");
    }
}
