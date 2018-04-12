

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
public class OverrideTest
{
	public void info(String name , double count)
	{
		System.out.println("name参数为：" + name);
		System.out.println("count参数为：" + count);
	}
	public static void main(String[] args)
	{
		OverrideTest ot = new OverrideTest();
		// 试图调用ot的info方法
		ot.info("crazyit.org" , 5);
	}
}
