package 抽象工厂;

public abstract class AbstractYellowHuman implements Human {
    @Override
    public String getColor() {
        return ("黄皮肤");
    }

    @Override
    public String talk() {
        return ("说黄语");
    }
}