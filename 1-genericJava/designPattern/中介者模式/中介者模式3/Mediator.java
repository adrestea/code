package 中介者模式.中介者模式3;

import java.util.Random;

public class Mediator extends AbstractMediator {
    public Mediator() {
        super();
    }

    @Override
    void execute(String str, Object... obj) {
        switch (str.toLowerCase()) {
            case "purchase.bug": {
                int need = (int) obj[0];
                int realBuy = new Random().nextInt(100 - need) + need;
                System.out.println("库存有" + mStock.getCount() + "台，需要立即购买至少" + need + "台，实际购买 " + realBuy + "台");
                mStock.increase(realBuy);
            }
            break;
            case "sale.sale": {
                int num = (int) obj[0];
                System.out.print("[[[[准备出售" + num + "台]]]]，");
                if (mStock.getCount() < num) {
                    System.out.println("库存有" + mStock.getCount() + "台，需要立即购买至少" + (num - mStock.getCount()));
                    mPurchase.buyComputer(num - mStock.getCount());
                }
                System.out.print("库存有" + mStock.getCount() + "台，可以出售。");
                mStock.decrease(num);
            }
            break;
        }
    }

    @Override
    public int getStockNumber() {
        return 0;
    }
}
