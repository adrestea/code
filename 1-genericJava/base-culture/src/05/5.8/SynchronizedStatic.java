

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
class SynchronizedStatic implements Runnable
{
	static boolean staticFlag = true;
	public static synchronized void test0()
	{
		for (int i = 0; i < 100 ; i++ )
		{
			System.out.println("test0：" +
				Thread.currentThread().getName() + " " + i);
		}
	}
	public void test1()
	{
		synchronized (SynchronizedStatic.class)
//		synchronized (this)
		{
			for (int i = 0; i < 100 ; i++ )
			{
				System.out.println("test1：" +
					Thread.currentThread().getName() + " " + i);
			}
		}
	}
	public void run()
	{
		if (staticFlag)
		{
			staticFlag = false;
			test0();
		}
		else
		{
			staticFlag = true;
			test1();
		}
	}
	public static void main(String[] args)
		throws Exception
	{
		SynchronizedStatic ss = new SynchronizedStatic();
		new Thread(ss).start();
		// 保证第一条线程开始运行
		Thread.sleep(10);
		new Thread(ss).start();
	}
}
