

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
public class Outer
{
	public static void main(String[] args)
		throws Exception
	{
		new Outer().test();
	}
	private void test()
		throws Exception
	{
		// �����Ǿ�̬�ڲ���Ķ���
		System.out.println(new Inner());        //��
		// ʹ�÷��䷽ʽ������Inner����
		System.out.println(Inner.class.newInstance()); //��
	}
	// ����һ���Ǿ�̬�ڲ���
	public class Inner
	{
//		public Inner()
//		{
//			System.out.println("Inner�޲����Ĺ�����");
//		}
//		public Inner(String name)
//		{
//			System.out.println("Inner�������ģ�" + name);
//		}
		public String toString()
		{
			return "Inner����";
		}
	}
}
