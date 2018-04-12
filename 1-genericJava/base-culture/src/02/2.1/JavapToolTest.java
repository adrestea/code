

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
public class JavapToolTest
{
	// 定义count实例变量，并为之指定初始值
	int count = 20;
	{
		// 初始化快中为count实例变量指定初始值
		count = 12;
	}
	// 定义两个构造器
	public JavapToolTest()
	{
		System.out.println(count);
	}
	public JavapToolTest(String name)
	{
		System.out.println(name);
	}
}
