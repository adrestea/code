

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
public class StringJoinTest2
{
	public static void main(String[] args)
	{
		String str1 = "Hello Java�ĳ���:10";
		// ��Ϊstr2��ֵ�����˷������ã���˲����ڱ���ʱȷ����
		String str2 = "Hello " + "Java" + "�ĳ���:"
			+ "Hello Java".length();
		System.out.println(str1 == str2);
		int len = 10;
		// ��Ϊstr3��ֵ�����˱�������˲����ڱ���ʱȷ����
		String str3 = "Hello " + "Java" + "�ĳ���:" + len;
		System.out.println(str1 == str3);
	}
}
