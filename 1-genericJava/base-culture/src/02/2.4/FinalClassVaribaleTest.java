

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
public class FinalClassVaribaleTest
{
	// ����final�����ʱ����ʼֵ
	final static int var1 = "���Java����".length();
	final static int var2;
	// �ھ�̬��ʼ������Ϊvar2����ʼֵ
	static {
		var2 = "������Java EE��ҵӦ��ʵս".length();
	}
	public static void main(String[] args)
	{
		System.out.println(FinalClassVaribaleTest.var1);
		System.out.println(FinalClassVaribaleTest.var2);
	}
}
