package 访问者模式.访问者模式2;

public class TheMain {
    public static void main(String[] args) {
        for (Employee emp : Utils.mockEmployee()) {
            emp.accept(new Visitor());
        }
    }
}
