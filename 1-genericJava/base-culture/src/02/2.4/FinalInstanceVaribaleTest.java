

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
public class FinalInstanceVaribaleTest
{
	// ����finalʵ������ʱ����ʼֵ
	final int var1 = "���Java����".length();
	final int var2;
	final int var3;
	// �ڳ�ʼ������Ϊvar2����ʼֵ
	{
		var2 = "������Java EE��ҵӦ��ʵս".length();
	}
	// �ڹ�������Ϊvar3����ʼֵ
	public FinalInstanceVaribaleTest()
	{
		this.var3 = "���XML����".length();
	}
	public static void main(String[] args)
	{
		FinalInstanceVaribaleTest fiv
			= new FinalInstanceVaribaleTest();
		System.out.println(fiv.var1);
		System.out.println(fiv.var2);
		System.out.println(fiv.var3);
	}
}
