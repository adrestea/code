

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
public class StaticInitTest
{
	// 定义count类变量，定义时指定初始值。
	static int count = 2;
	// 通过静态初始化块为name类变量指定初始值
	static {
		System.out.println("StaticInitTest的静态初始化块");
		name = "Java编程";
	}
	// 定义name类变量时指定初始值
	static String name = "疯狂Java讲义";
	public static void main(String[] args)
	{
		// 访问该类的两个类变量
		System.out.println("count类变量的值："
			+ StaticInitTest.count);
		System.out.println("name类变量的值："
			+ StaticInitTest.name);
	}
}
