package 建造者模式;

public class TheMain {

    public static void main(String args[]) {
        Director director = new Director();
        director.getABenzModel().run();
        System.out.println("===================");
        director.getBBenzModel().run();
        System.out.println("===================");
        director.getCBMWModel().run();
        System.out.println("===================");
        director.getDBMWModel().run();
        System.out.println("===================");
    }
}