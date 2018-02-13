package 模板方法;

class HummerModel_A extends HummerModel {

    @Override
    protected void alarm() {
        System.out.println("HummerModel_A alarm");
    }

    @Override
    protected void stop() {
        System.out.println("HummerModel_A stop");
    }

    @Override
    protected void start() {
        System.out.println("HummerModel_A start");
    }
}
