package 享元模式.享元模式4;

/**
 * 享元模式：重写pool的key（即ExtrinsicState）类的hasCode和equals方法。
 * hasCode方法在containsKey的时候被调用，
 */
public class TheMain {
    public static void main(String[] args) {
//初始化对象池
        ExtrinsicState state1 = new ExtrinsicState();
        state1.setSubject("科目1");
        state1.setLocation("上海");
        SignInfoFactory.getSignInfo(state1);
        ExtrinsicState state2 = new ExtrinsicState();
        state2.setSubject("科目1");
        state2.setLocation("上海");
//计算执行100万次需要的时间
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SignInfoFactory.getSignInfo(state2);
        }
        long tailTime = System.currentTimeMillis();
        System.out.println("执行时间:" + (tailTime - currentTime) + " ms");
    }
}
