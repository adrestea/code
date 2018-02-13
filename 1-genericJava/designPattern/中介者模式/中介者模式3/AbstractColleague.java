package 中介者模式.中介者模式3;

public abstract class AbstractColleague {
    AbstractMediator mMediator = null;

    AbstractColleague(AbstractMediator _mediator) {
        this.mMediator = _mediator;
    }
}
