

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
public class ClosureTest
{
	public static void main(String[] args)
	{
		// 定义一个局部变量
		final String str = "Java";
		// 在内部类里访问局部变量str
		new Thread(new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 100 ; i++ )
				{
					// 此处将一直可以访问到str局部变量
					System.out.println(str + " " + i);
					// 暂停0.1秒
					try
					{
						Thread.sleep(100);
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
				}
			}
		}).start();            //①
		// 执行到此处，main方法结束
	}
}