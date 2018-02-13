package 抽象工厂;

public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new YellowFemaleHuman();
    }

    @Override
    public Human createBlankHuman() {
        return new BlankFemaleHuman();

    }

    @Override
    public Human createWhiteHuman() {
        return new WhiteFemaleHuman();
    }
}