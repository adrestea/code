

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
public class FinalInitTest
{
	// ����3��finalʵ������
	final String str1;
	final String str2;
	final String str3 = "Java";
	// str1��str2�ֱ���ڷǾ�̬��ʼ���顢�������г�ʼ��
	{
		str1 = "Java";
	}
	public FinalInitTest()
	{
		str2 = "Java";
	}
	// �ж�str1��str2��str3�Ƿ�ִ��"���滻"
	public void display()
	{
		System.out.println(str1 + str1 == "JavaJava");
		System.out.println(str2 + str2 == "JavaJava");
		System.out.println(str3 + str3 == "JavaJava");
	}
	public static void main(String[] args)
	{
		FinalInitTest fit = new FinalInitTest();
		fit.display();
	}
}
