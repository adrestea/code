package 抽象工厂;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Random;

public class TheMain_NvWa {
    static HumanFactory maleFactory = new MaleFactory();
    static HumanFactory femaleFactory = new FemaleFactory();
    final static int COUNT = 111;
    static int[] c = new int[3]/*{Math.round(COUNT * 1 / 11), Math.round(COUNT * 4 / 11), Math.round(COUNT * 6 / 11)}*/;

    public static void main(String args[]) {
        ArrayList<Human> list = new ArrayList<>();

        c = new int[]{getC(1), getC(4), getC(6)};

        while (c[0] != 0 || c[1] != 0 || c[2] != 0) {
            Human h = getHuman();
            list.add(h);
        }
        printAll(list);

    }

    static void printAll(ArrayList<Human> list) {
        int yFCount = 0;
        int yMCount = 0;
        int bFCount = 0;
        int bMCount = 0;
        int wFCount = 0;
        int wMCount = 0;
        for (Human h : list) {
//            System.out.println("--->" + h.getColor() + ": " + h.getSex() + ": " + h.talk());
            if (h instanceof WhiteFemaleHuman) {
                wFCount++;
            } else if (h instanceof WhiteMaleHuman) {
                wMCount++;
            } else if (h instanceof YellowFemaleHuman) {
                yFCount++;
            } else if (h instanceof YellowMaleHuman) {
                yMCount++;
            } else if (h instanceof BlankFemaleHuman) {
                bFCount++;
            } else if (h instanceof BlankMaleHuman) {
                bMCount++;
            }
        }
        System.out.println("--->yFCount=" + yFCount + "\t--->yMCount=" + yMCount);
        System.out.println("---------------------------------->yCount=" + (yMCount + yFCount));
        System.out.println("--->bFCount=" + bFCount + "\t--->bMCount=" + bMCount);
        System.out.println("---------------------------------->bCount=" + (bFCount + bMCount));
        System.out.println("--->wFCount=" + wFCount + "\t--->wMCount=" + wMCount);
        System.out.println("---------------------------------->wCount=" + (wFCount + wMCount));
        System.out.println("--->All Count=" + (wMCount + wFCount + bMCount + bFCount + yMCount + yFCount));
    }

    static int getC(int rate) {
        BigDecimal big_i = new BigDecimal(COUNT / 11.0 * rate).setScale(0, RoundingMode.HALF_UP);
        return big_i.intValue();
    }

    static Human getHuman() {
        int radom = new Random().nextInt(6);
//        System.out.println("-------------> random = " + radom);
        try {
            Human h = getVaildateHumanByIndex(radom);
            if (h != null) {
                return h;
            } else {
                return getHuman();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    static Human getVaildateHumanByIndex(int index) throws Exception {
        Human h = null;
        switch (index) {
            case 0:
                h = maleFactory.createBlankHuman();
                break;
            case 1:
                h = femaleFactory.createBlankHuman();
                break;
            case 2:
                h = maleFactory.createYellowHuman();
                break;
            case 3:
                h = femaleFactory.createYellowHuman();
                break;
            case 4:
                h = maleFactory.createWhiteHuman();
                break;
            case 5:
                h = femaleFactory.createWhiteHuman();
        }
        if (h == null)
            throw new Exception("index error!  index = " + index);
        int type = index / 2;
        if (c[type] > 0) {
            c[type]--;
            return h;
        }
        return null;
    }
}