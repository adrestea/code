

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
public class StringCompare
{
	public static void main(String[] args)
	{
		String s1 = new String("abc");
		String s2 = new String("z");
		String s3 = new String("abc");
		// ͨ��compareTo�Ƚ��ַ����Ĵ�С
		if (s1.compareTo(s3) == 0)
		{
			System.out.println("s1��s3�������ַ��������");
		}
		if (s1.compareTo(s2) < 0)
		{
			System.out.println("s1С��s2");
		}
		// ͨ��equals�Ƚ��ַ����������ַ������Ƿ���ͬ
		System.out.println("s1��s3�������ַ������Ƿ���ͬ:"
			+ s1.equals(s3));
		// ͨ��==������Ƚ������ַ������ñ����Ƿ�ָ��ͬһ���ַ�������
		System.out.println("s1��s3��ָ���ַ����Ƿ���ͬ:"
			+ (s1 == s3));
	}
}
