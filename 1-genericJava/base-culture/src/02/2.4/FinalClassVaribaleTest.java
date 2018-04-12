

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
public class FinalClassVaribaleTest
{
	// 定义final类变量时赋初始值
	final static int var1 = "疯狂Java讲义".length();
	final static int var2;
	// 在静态初始化块中为var2赋初始值
	static {
		var2 = "轻量级Java EE企业应用实战".length();
	}
	public static void main(String[] args)
	{
		System.out.println(FinalClassVaribaleTest.var1);
		System.out.println(FinalClassVaribaleTest.var2);
	}
}
