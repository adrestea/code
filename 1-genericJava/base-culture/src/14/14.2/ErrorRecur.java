

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
class CountThread implements Runnable
{
	private int count;
	public CountThread(int count)
	{
		this.count = count;
	}
	public void run()
	{
		// 如果count < 10，将count扩大一倍
		if (count < 10)
		{         //①
			count <<= 1;
			System.out.println("增加一倍的count为：" + count);
		}
		else
		{
			System.out.println("count已经大于10，无需执行相乘");
		}
	}
}
public class ErrorRecur
{
	public static void main(String[] args)
	{
		CountThread ct = new CountThread(8);
		// 启动两条线程
		new Thread(ct).start();
		new Thread(ct).start();
	}
}
