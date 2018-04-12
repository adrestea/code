

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
class Outer
{
	private String name;
	private static int staticField = 20;
	public static class Inner
	{
		public void info()
		{
			// �ֱ�����ⲿ���о�̬��field�ͷǾ�̬��field
			System.out.println("�ⲿ���staticFieldΪ��"
				+ staticField);   //��
			System.out.println("�ⲿ���nameΪ��" + name);//��
		}
	}
}
public class InnerTest
{
	public static void main(String[] args)
	{
		// ����������Inner�ڲ����ʵ��
		Outer.Inner in = new Outer.Inner();
		in.info();
	}
}