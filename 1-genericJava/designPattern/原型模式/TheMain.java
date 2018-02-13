package 原型模式;

import java.util.Random;

/**
 * 定义：Specify the kinds of objects to create using a prototypical instance,and create new objects by copying this prototype.(用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象。)
 *
 * 备注：mail实现Cloneable接口然后通过mail.clone()快速创建新对象。
 * Todo：使用多线程实现发送mail能够提高效率
 */
public class TheMain {

    //发送账单的数量,这个值是从数据库中获得
    private static int MAX_COUNT = 1200;

    public static void main(String[] args) {
//模拟发送邮件
        int i = 0;
//把模板定义出来,这个是从数据中获得
        long t1 = System.currentTimeMillis();
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
//以下是每封邮件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
//然后发送邮件
            sendMail(cloneMail);
            i++;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Time elspend:" + (t2 - t1));
    }

    //发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t收件人: " +
                "\tApplication：" + mail.getAppellation() +
                "\tContxt：" + mail.getContxt() +
                mail.getReceiver() + "\t...发送成功 !");
    }

    //获得指定长度的随机字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}