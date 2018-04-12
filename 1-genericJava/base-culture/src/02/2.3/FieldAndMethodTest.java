

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
	int count = 2;
	public void display()
	{
		System.out.println(this.count);
	}
}
class Derived extends Base
{
	int count = 20;
	@Override
	public void display()
	{
		System.out.println(this.count);
	}
}
public class FieldAndMethodTest
{
	public static void main(String[] args)
	{
		// ����������һ��Base����
		Base b = new Base();             //��
		// ֱ�ӷ���countʵ��������ͨ��display����countʵ������
		System.out.println(b.count);
		b.display();
		// ������������һ��Derived����
		Derived d = new Derived();       //��
		// ֱ�ӷ���countʵ��������ͨ��display����countʵ������
		System.out.println(d.count);
		d.display();
		// ����һ��Base����������Derived���󸳸��ñ���
		Base bd = new Derived();         //��
		// ֱ�ӷ���countʵ��������ͨ��display����countʵ������
		System.out.println(bd.count);
		bd.display();
		// ��d2b����ָ��ԭd������ָ���Dervied����
		Base d2b = d;                    //��
		// ����d2b��ָ�����countʵ������
		System.out.println(d2b.count);
	}
}
