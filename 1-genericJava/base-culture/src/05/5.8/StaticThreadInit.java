

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
//		// ���������ڲ������������߳�
//		Thread t = new Thread()
//		{
//			// �������߳̽�website��������Ϊwww.fkjava.org
//			public void run()
//			{
//				System.out.println("����run����");
//				System.out.println(website);
//				website = "www.fkjava.org";
//				System.out.println("�˳�run����");
//			}
//		};
//		t.start();
//		try
//		{
//			// ����t�߳�
//			t.join();
//		}
//		catch (Exception ex)
//		{
//			ex.printStackTrace();
//		}
//	}

//	static
//	{
//		// ���������ڲ������������߳�
//		Thread t = new Thread()
//		{
//			// �������߳̽�website��������Ϊwww.fkjava.org
//			public void run()
//			{
//				System.out.println("����run����");
//				System.out.println(website);
//				website = "www.fkjava.org";
//				System.out.println("�˳�run����");
//			}
//		};
//		t.start();
//	}

static
{
	// ���������ڲ������������߳�
	Thread t = new Thread()
	{
		// �������߳̽�website��������Ϊwww.fkjava.org
		public void run()
		{
			System.out.println("����run����");
			System.out.println(website);
			website = "www.fkjava.org";
			System.out.println("�˳�run����");
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

	// ����һ����̬field���������ʼֵΪwww.crazyit.org
	static String website = "www.crazyit.org";
	public static void main(String[] args)
	{
		System.out.println(StaticThreadInit.website);
	}
}
