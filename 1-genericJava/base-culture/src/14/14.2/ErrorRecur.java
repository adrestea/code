

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
class CountThread implements Runnable
{
	private int count;
	public CountThread(int count)
	{
		this.count = count;
	}
	public void run()
	{
		// ���count < 10����count����һ��
		if (count < 10)
		{         //��
			count <<= 1;
			System.out.println("����һ����countΪ��" + count);
		}
		else
		{
			System.out.println("count�Ѿ�����10������ִ�����");
		}
	}
}
public class ErrorRecur
{
	public static void main(String[] args)
	{
		CountThread ct = new CountThread(8);
		// ���������߳�
		new Thread(ct).start();
		new Thread(ct).start();
	}
}
