

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
public class Account
{
	private String accountNo;
	private double balance;
	public Account(){}
	public Account(String accountNo , double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	// 访问该账户的余额
	public double getBalance()
	{
		 return this.balance;
	}
	public void draw(double drawAmount)
	{
		// 账户余额大于取钱数目
		if (balance >= drawAmount)
		{       //①
//			// 暂停当前线程，切换为执行另一条线程
//			try
//			{
//				Thread.sleep(1);
//			}
//			catch (Exception ex)
//			{
//				ex.printStackTrace();
//			}
			// 吐出钞票
			System.out.println(Thread.currentThread().getName()
				+ "取钱成功！吐出钞票:" + drawAmount);
			// 修改余额
			balance -= drawAmount;
			System.out.println("\t余额为: " + balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName() +
				"取钱失败！余额不足！");
		}
	}
	// 重写hashCode()方法
	public int hashCode()
	{
		return accountNo.hashCode();
	}
	// 重写equals()方法
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		if (obj.getClass() == Account.class)
		{
			Account target = (Account)obj;
			return accountNo.equals(target.accountNo);
		}
		return false;
	}
}