package 状态模式.状态模式2;

public class StoppingState extends LiftState {
    //停止状态关门?电梯门本来就是关着的!
    @Override
    public void close() {
//do nothing;
        System.out.println("违规操作，这里什么都不会做");
    }

    //停止状态,开门,那是要的!
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    //停止状态再运行起来,正常得很
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    //停止状态是怎么发生的呢?当然是停止方法执行了
    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
