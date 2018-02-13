package 模板方法;

class HummerModel_B extends HummerModel {

    @Override
    protected void alarm() {
        System.out.println("HummerModel_B alarm");
    }

    @Override
    protected void stop() {
        System.out.println("HummerModel_B stop");
    }

    @Override
    protected void start() {
        System.out.println("HummerModel_B start");
    }

}
