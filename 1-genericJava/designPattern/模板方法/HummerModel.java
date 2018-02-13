package 模板方法;

abstract class HummerModel {
    final void run() {
        start();
        alarm();
        stop();
    }

    protected abstract void alarm();

    protected abstract void stop();

    protected abstract void start();
}
