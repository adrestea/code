

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
class Out
{
	class In
	{
		public void test()
		{
			System.out.println("In的test方法");
		}
	}
	// 定义类A继承In类
	class A extends In
	{
	}
}
// 定义类OutTest继承In类
public class OutTest extends Out.In
{
	public OutTest()
	{
		// 因为Out.In没有无参数的构造器
		// 显式调用父类指定的构造器
		new Out().super();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
