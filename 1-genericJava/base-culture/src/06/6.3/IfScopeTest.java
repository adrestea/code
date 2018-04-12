

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
public class IfScopeTest
{
	public static void main(String[] args)
	{
		int age = 45;
		if (age > 60)
			System.out.println("年龄大于60");
			System.out.println("老年人");    //①
		else if (age > 40)                   //②
			System.out.println("年龄在40到60之间");
			System.out.println("中年人");
		else if (age > 20)                   //③
			System.out.println("年龄在20到40之间");
			System.out.println("青年人");
	}
}
