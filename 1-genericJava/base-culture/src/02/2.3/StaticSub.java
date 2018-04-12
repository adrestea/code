

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
class StaticBase
{
	// 定义一个count类变量
	static int count = 20;
}
public class StaticSub extends StaticBase
{
	// 子类再定义一个count类变量
	static int count = 200;
	public void info()
	{
		System.out.println("访问本类的count类变量:"
			+ count);
		System.out.println("访问父类的count类变量:"
			+ StaticBase.count);
		System.out.println("访问父类的count类变量:"
			+ super.count);
	}
	public static void main(String[] args)
	{
		StaticSub sb = new StaticSub();
		sb.info();
	}
}
