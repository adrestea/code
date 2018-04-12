

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
public class StaticThreadInit
{
//	static
//	{
//		// 创建匿名内部类来启动新线程
//		Thread t = new Thread()
//		{
//			// 启动新线程将website属性设置为www.fkjava.org
//			public void run()
//			{
//				System.out.println("进入run方法");
//				System.out.println(website);
//				website = "www.fkjava.org";
//				System.out.println("退出run方法");
//			}
//		};
//		t.start();
//		try
//		{
//			// 加入t线程
//			t.join();
//		}
//		catch (Exception ex)
//		{
//			ex.printStackTrace();
//		}
//	}

//	static
//	{
//		// 创建匿名内部类来启动新线程
//		Thread t = new Thread()
//		{
//			// 启动新线程将website属性设置为www.fkjava.org
//			public void run()
//			{
//				System.out.println("进入run方法");
//				System.out.println(website);
//				website = "www.fkjava.org";
//				System.out.println("退出run方法");
//			}
//		};
//		t.start();
//	}

static
{
	// 创建匿名内部类来启动新线程
	Thread t = new Thread()
	{
		// 启动新线程将website属性设置为www.fkjava.org
		public void run()
		{
			System.out.println("进入run方法");
			System.out.println(website);
			website = "www.fkjava.org";
			System.out.println("退出run方法");
		}
	};
	t.start();
	try
	{
		Thread.sleep(1);
	}
	catch (Exception ex)
	{
		ex.printStackTrace();
	}
}

	// 定义一个静态field，设置其初始值为www.crazyit.org
	static String website = "www.crazyit.org";
	public static void main(String[] args)
	{
		System.out.println(StaticThreadInit.website);
	}
}
