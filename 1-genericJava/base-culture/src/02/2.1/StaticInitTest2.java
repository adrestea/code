

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

public class StaticInitTest2
{
	// 定义name类变量，定义时指定初始值。
	static String name;
	static{
		name = prefix + "讲义";
	}
	static String prefix = "疯狂Java";

	public static void main(String[] args)
	{
		// 访问该类的两个类变量
		System.out.println("name类变量的值："
			+ StaticInitTest2.name);
		System.out.println("prefix类变量的值："
			+ StaticInitTest2.prefix);
	}
}
