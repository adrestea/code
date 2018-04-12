

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
		String s1 = "疯狂Java";
		String s2 = "疯狂" + "Java";
		System.out.println(s1 == s2);
		// 定义2个字符串直接量
		final String str1 = "疯狂";
		final String str2 = "Java";
		// 将str1和str2进行连接运算
		String s3 = str1 + str2;
		System.out.println(s1 == s3);
	}
}
