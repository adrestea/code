

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
public class StringJoinTest
{
	public static void main(String[] args)
	{
		String str1 = "Hello Java�ĳ���:10";
		// ��Ȼstr2��ֵ����ֱ����������Ϊstr2��ֵ�����ڱ���ʱȷ����
		// ���str2Ҳ��ֱ�������ַ������ж�Ӧ���ַ���
		String str2 = "Hello " + "Java" + "�ĳ���:" + 10;
		System.out.println(str1 == str2);
	}
}
