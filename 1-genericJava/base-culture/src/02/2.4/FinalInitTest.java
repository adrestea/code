

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class FinalInitTest
{
	// 定义3个final实例变量
	final String str1;
	final String str2;
	final String str3 = "Java";
	// str1、str2分别放在非静态初始化块、构造器中初始化
	{
		str1 = "Java";
	}
	public FinalInitTest()
	{
		str2 = "Java";
	}
	// 判断str1、str2、str3是否执行"宏替换"
	public void display()
	{
		System.out.println(str1 + str1 == "JavaJava");
		System.out.println(str2 + str2 == "JavaJava");
		System.out.println(str3 + str3 == "JavaJava");
	}
	public static void main(String[] args)
	{
		FinalInitTest fit = new FinalInitTest();
		fit.display();
	}
}
