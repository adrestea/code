package 状态模式.状态模式1;

public interface ILift {
    //电梯的4个状态
    public final static int OPENING_STATE = 1;
    public final static int CLOSING_STATE = 2;
    public final static int RUNNING_STATE = 3;
    public final static int STOPPING_STATE = 4;

    //设置电梯的状态
    void setState(int state);

    //首先电梯门开启动作
    void open();

    //电梯门可以开启,那当然也就有关闭了
    void close();

    //电梯要能上能下,运行起来
    void run();

    //敞门状态
//闭门状态
//运行状态
//停止状态//电梯还要能停下来
    void stop();
}