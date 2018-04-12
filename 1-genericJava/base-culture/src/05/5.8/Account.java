

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
	// ���ʸ��˻������
	public double getBalance()
	{
		 return this.balance;
	}
	public void draw(double drawAmount)
	{
		// �˻�������ȡǮ��Ŀ
		if (balance >= drawAmount)
		{       //��
//			// ��ͣ��ǰ�̣߳��л�Ϊִ����һ���߳�
//			try
//			{
//				Thread.sleep(1);
//			}
//			catch (Exception ex)
//			{
//				ex.printStackTrace();
//			}
			// �³���Ʊ
			System.out.println(Thread.currentThread().getName()
				+ "ȡǮ�ɹ����³���Ʊ:" + drawAmount);
			// �޸����
			balance -= drawAmount;
			System.out.println("\t���Ϊ: " + balance);
		}
		else
		{
			System.out.println(Thread.currentThread().getName() +
				"ȡǮʧ�ܣ����㣡");
		}
	}
	// ��дhashCode()����
	public int hashCode()
	{
		return accountNo.hashCode();
	}
	// ��дequals()����
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