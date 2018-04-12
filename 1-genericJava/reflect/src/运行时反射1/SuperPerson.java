package 运行时反射1;

/**
 * Created by yuanyc on 2016/1/28.
 */
public class SuperPerson extends Person implements Smoke.Smoking {
    private boolean isMan;

    public void fly() {
        System.out.println("走你~~");
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean iaMan) {
        isMan = iaMan;
    }

    @Override
    public void smoke(int count) {

    }
}
