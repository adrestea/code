package 装饰模式.装饰模式2;
/**
 * 装饰模式(Decorator Pattern)是一种比较常见的模式,其定义如下:Attach additional responsibilities to an object dynamically keeping the same interface.Decorators provide a flexible alternative to subclassing for extending functionality.(动态地给一个对象添加一些额外的职责。就增加功能来说,装饰模式相比生成子类更为灵活。)
 * 优点：1）装饰者类和被装饰者类相互独立，不会互相影响。「」2）
 * */
public class TheMain {
    public static void main(String[] args) {
//把成绩单拿过来
        SchoolReport sr;
//原装的成绩单
        sr = new FouthGradeSchoolReport();
//加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
//又加了成绩排名的说明
        sr = new SortDecorator(sr);
//看成绩单
        sr.report();
//然后老爸一看,很开心,就签名了
        sr.sign("老三"); //我叫小三,老爸当然叫老三
    }
}