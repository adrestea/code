package 抽象工厂;

public class MaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new YellowMaleHuman();
    }

    @Override
    public Human createBlankHuman() {
        return new BlankMaleHuman();

    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteMaleHuman();
    }
}