

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
public class NullInvocation
{
	public static void info()
	{
		System.out.println("静态的info方法");
	}
	public static void main(String[] args)
	{
		// 声明一个NullInvocation变量，并将一个null赋给该变量
		NullInvocation ni = null;
		ni.info();
	}
}
