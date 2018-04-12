

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
}
class Mid extends Base
{
	int count = 20;
}
public class Sub2 extends Mid
{
	int count = 200;
	public void accessMid()
	{
		System.out.println(super.count);
	}
	public void accessMid()
	{
		System.out.println(super.count);
	}

	public static void main(String[] args)
	{
		// ����һ��Sub����
		Sub2 s = new Sub2();
		// ��Sub��������ת�ͺ�ΪMid��Base���͵ı���
		Mid s2m = s;
		Base s2b = s;
		// �ֱ�ͨ��3������������countʵ������
		System.out.println(s.count);
		System.out.println(s2m.count);
		System.out.println(s2b.count);
		// ����accessMid����
		s.accessMid();
	}
}