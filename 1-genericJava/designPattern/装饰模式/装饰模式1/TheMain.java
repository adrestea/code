package 装饰模式.装饰模式1;

public class TheMain {
    public static void main(String[] args) {
//把成绩单拿过来
        SchoolReport sr = new SugarFouthGradeSchoolReport();
//看成绩单
        sr.report();
//签名
        sr.sign("老三");
    }
}
