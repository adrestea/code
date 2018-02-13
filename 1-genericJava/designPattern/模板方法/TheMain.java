package 模板方法;

public class TheMain {
    public static void main(String[] args) {
        HummerModel_A ha = new HummerModel_A();
        ha.run();

        System.out.println("===========================================");
        HummerModel_B hb = new HummerModel_B();
        hb.run();
    }
}
