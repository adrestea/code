package 享元模式.享元模式1;
/**
 * 享元模式：共享元类对象
 * */
public class TheMain {
    public static void main(String[] args) {
//初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + i;
//初始化地址
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }
        
        SignInfoFactory.getSignInfo("科目1考试地点1");
        SignInfoFactory.getSignInfo("科目1考试地点2");
        SignInfoFactory.getSignInfo("科目1考试地点200");
    }
}
