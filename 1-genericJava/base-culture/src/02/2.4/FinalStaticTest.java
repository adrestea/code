

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
public class FinalStaticTest
{
	// ����2��final�����
	final static String str1;
	final static String str2 = "Java";
	// str1���ھ�̬��ʼ�����г�ʼ��
	static {
		str1 = "Java";
	}
	public static void main(String[] args)
	{
		System.out.println(str1 + str1 == "JavaJava");
		System.out.println(str2 + str2 == "JavaJava");   //��
	}
}
