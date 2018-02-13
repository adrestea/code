package 适配器模式.适配器模式3;

public class TheMain {
    public static void main(String[] args) {
//传递三个对象
        IUserInfo youngGirl = new OuterUserInfo();
//从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}