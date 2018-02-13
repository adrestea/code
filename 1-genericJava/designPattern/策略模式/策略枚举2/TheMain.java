package 策略模式.策略枚举2;

public class TheMain {
    public static void main(String[] args) {
        System.out.println("----------------> " + Year.FEB.ContainDays(2020));
        System.out.println("----------------> " + Year.FEB.ContainDays(2019));
        System.out.println("----------------> " + Year.FEB.ContainDays(2018));
        System.out.println("----------------> " + Year.FEB.ContainDays(2017));
        System.out.println("----------------> " + Year.FEB.ContainDays(2016));
    }
}
