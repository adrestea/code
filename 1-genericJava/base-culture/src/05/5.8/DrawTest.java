

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version 1.0
 * <br>Copyright (C), 2005-2008, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date:
 */
class DrawThread extends Thread
{
	// ģ���û��˻�
	private Account account;
	// ��ǰȡǮ�߳���ϣ��ȡ��Ǯ��
	private double drawAmount;

	public DrawThread(String name , Account account ,
		double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	// �������߳��޸�ͬһ����������ʱ�����漰�����ݰ�ȫ���⡣
	public void run()
	{
		account.draw(drawAmount);
	}
}
public class DrawTest
{
	public static void main(String[] args)
	{
		// ����һ���˻�
		Account acct = new Account("1234567" , 1000);
		// ģ�������̶߳�ͬһ���˻�ȡǮ
		new DrawThread("��" , acct , 800).start();
		new DrawThread("��" , acct , 800).start();
	}
}
