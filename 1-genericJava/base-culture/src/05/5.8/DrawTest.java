

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
	// 模拟用户账户
	private Account account;
	// 当前取钱线程所希望取的钱数
	private double drawAmount;

	public DrawThread(String name , Account account ,
		double drawAmount)
	{
		super(name);
		this.account = account;
		this.drawAmount = drawAmount;
	}

	// 当多条线程修改同一个共享数据时，将涉及到数据安全问题。
	public void run()
	{
		account.draw(drawAmount);
	}
}
public class DrawTest
{
	public static void main(String[] args)
	{
		// 创建一个账户
		Account acct = new Account("1234567" , 1000);
		// 模拟两个线程对同一个账户取钱
		new DrawThread("甲" , acct , 800).start();
		new DrawThread("乙" , acct , 800).start();
	}
}
