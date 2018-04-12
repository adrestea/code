

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
public class StaticThreadInit2
{
	static
	{
		// 创建匿名内部类来启动新线程
		Thread t = new Thread()
		{
			// 启动新线程将website属性设置为www.fkjava.org
			public void run()
			{
				website = "www.fkjava.org";
			}
		};
		t.start();
	}
	// 定义一个静态field
	final static String website;
	public static void main(String[] args)
	{
		System.out.println(StaticThreadInit.website);
	}
}
