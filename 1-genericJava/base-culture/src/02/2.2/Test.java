

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
class Base
{
	// ������һ����Ϊi��ʵ������
	private int i = 2;
	public Base()
	{
		this.display();
	}
	public void display()
	{
		System.out.println(i);
	}
}
// �̳�Base��Derived����
class Derived extends Base
{
	// ������һ����Ϊi��ʵ������
	private int i = 22;
	// ����������ʵ������i��ʼ��Ϊ222
	public Derived()
	{
		i = 222;              //��
	}
	public void display()
	{
		System.out.println(i);
	}
}
public class Test
{
	public static void main(String[] args)
	{
		// ����Derived�Ĺ���������ʵ��
		new Derived();       //��
	}
}