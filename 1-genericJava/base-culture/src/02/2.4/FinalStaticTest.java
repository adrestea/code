

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
public class FinalStaticTest
{
	// 定义2个final类变量
	final static String str1;
	final static String str2 = "Java";
	// str1放在静态初始化块中初始化
	static {
		str1 = "Java";
	}
	public static void main(String[] args)
	{
		System.out.println(str1 + str1 == "JavaJava");
		System.out.println(str2 + str2 == "JavaJava");   //①
	}
}
