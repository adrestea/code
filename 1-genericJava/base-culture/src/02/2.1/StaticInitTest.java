

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
public class StaticInitTest
{
	// ����count�����������ʱָ����ʼֵ��
	static int count = 2;
	// ͨ����̬��ʼ����Ϊname�����ָ����ʼֵ
	static {
		System.out.println("StaticInitTest�ľ�̬��ʼ����");
		name = "Java���";
	}
	// ����name�����ʱָ����ʼֵ
	static String name = "���Java����";
	public static void main(String[] args)
	{
		// ���ʸ�������������
		System.out.println("count�������ֵ��"
			+ StaticInitTest.count);
		System.out.println("name�������ֵ��"
			+ StaticInitTest.name);
	}
}
