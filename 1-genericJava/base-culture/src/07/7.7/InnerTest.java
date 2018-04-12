

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
class Outer
{
	private String name;
	private static int staticField = 20;
	public static class Inner
	{
		public void info()
		{
			// 分别访问外部类中静态的field和非静态的field
			System.out.println("外部类的staticField为："
				+ staticField);   //①
			System.out.println("外部类的name为：" + name);//②
		}
	}
}
public class InnerTest
{
	public static void main(String[] args)
	{
		// 声明并创建Inner内部类的实例
		Outer.Inner in = new Outer.Inner();
		in.info();
	}
}