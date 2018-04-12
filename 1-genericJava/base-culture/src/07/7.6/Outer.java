

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
public class Outer
{
	public static void main(String[] args)
		throws Exception
	{
		new Outer().test();
	}
	private void test()
		throws Exception
	{
		// 创建非静态内部类的对象
		System.out.println(new Inner());        //①
		// 使用反射方式来创建Inner对象
		System.out.println(Inner.class.newInstance()); //②
	}
	// 定义一个非静态内部类
	public class Inner
	{
//		public Inner()
//		{
//			System.out.println("Inner无参数的构造器");
//		}
//		public Inner(String name)
//		{
//			System.out.println("Inner构造器的：" + name);
//		}
		public String toString()
		{
			return "Inner对象";
		}
	}
}
