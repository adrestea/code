package 装饰模式.装饰模式1;

public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    @Override
    void report() {
        reportHighScore();
        System.out.println("\n>>>>>>>>>>>>>>装饰前<<<<<<<<<<<<<<\n");
        super.report();
        System.out.println("\n>>>>>>>>>>>>>>装饰后<<<<<<<<<<<<<<\n");
        reportSort();
    }

    //首先要定义你要美化的方法,先给老爸说学校最高成绩
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75,数学是78,自然是80");
    }

    //在老爸看完毕成绩单后,我再汇报学校的排名情况
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
}
