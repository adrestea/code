

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
public class ClosureTest
{
	public static void main(String[] args)
	{
		// ����һ���ֲ�����
		final String str = "Java";
		// ���ڲ�������ʾֲ�����str
		new Thread(new Runnable()
		{
			public void run()
			{
				for (int i = 0; i < 100 ; i++ )
				{
					// �˴���һֱ���Է��ʵ�str�ֲ�����
					System.out.println(str + " " + i);
					// ��ͣ0.1��
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
		}).start();            //��
		// ִ�е��˴���main��������
	}
}