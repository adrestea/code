

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

public class StaticInitTest2
{
	// ����name�����������ʱָ����ʼֵ��
	static String name;
	static{
		name = prefix + "����";
	}
	static String prefix = "���Java";

	public static void main(String[] args)
	{
		// ���ʸ�������������
		System.out.println("name�������ֵ��"
			+ StaticInitTest2.name);
		System.out.println("prefix�������ֵ��"
			+ StaticInitTest2.prefix);
	}
}
