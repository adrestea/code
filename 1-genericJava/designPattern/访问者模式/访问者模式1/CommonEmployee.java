package 访问者模式.访问者模式1;

public class CommonEmployee extends Employee {
    //工作内容,这非常重要,以后的职业规划就是靠它了
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    protected String getOtherInfo() {
        return "工作:" + this.job + "\t";
    }
}
