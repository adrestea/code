

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
public class StaticThreadInit2
{
	static
	{
		// ���������ڲ������������߳�
		Thread t = new Thread()
		{
			// �������߳̽�website��������Ϊwww.fkjava.org
			public void run()
			{
				website = "www.fkjava.org";
			}
		};
		t.start();
	}
	// ����һ����̬field
	final static String website;
	public static void main(String[] args)
	{
		System.out.println(StaticThreadInit.website);
	}
}
