package 抽象工厂;

public abstract class AbstractWhiteHuman implements Human {
    @Override
    public String getColor() {
        return ("白皮肤");
    }

    @Override
    public String talk() {
        return ("说白语");
    }
}