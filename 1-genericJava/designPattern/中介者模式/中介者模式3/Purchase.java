package 中介者模式.中介者模式3;

public class Purchase extends AbstractColleague {

    Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void buyComputer(int num) {
        super.mMediator.execute("purchase.bug", num);
    }

    public void refuseBuy() {
        System.out.println("refuseBuy!");
    }
}