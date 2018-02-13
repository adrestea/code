package 抽象工厂;

public abstract class AbstractBlankHuman implements Human {
    @Override
    public String getColor() {
        return ("黑皮肤");
    }

    @Override
    public String talk() {
        return ("说黑语");
    }
}