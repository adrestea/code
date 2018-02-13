package 访问者模式.访问者模式1;

public class TheMain {
    public static void main(String[] args) {
        for (Employee emp : utils.mockEmployee()) {
            emp.report();
        }
    }
}
