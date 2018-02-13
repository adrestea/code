package 中介者模式.中介者模式3;

public class TheMain {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Sale sale = new Sale(mediator);
        sale.sellComputer();
        System.out.println("===========================");
        sale.sellComputer();
        System.out.println("===========================");
        sale.sellComputer();
        System.out.println("===========================");
        sale.sellComputer();
        System.out.println("===========================");
        sale.sellComputer();
        System.out.println("===========================");
        sale.sellComputer();
        System.out.println("===========================");
        sale.sellComputer();
        System.out.println("===========================");
        Purchase purchase = new Purchase(mediator);
        Stock stock = new Stock(mediator);
    }
}
