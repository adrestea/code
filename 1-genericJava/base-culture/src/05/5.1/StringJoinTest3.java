

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
public class StringJoinTest3
{
	public static void main(String[] args)
	{
		String str1 = "Hello Java的长度:10";
		// 因为str2的值包含了方法调用，因此不能在编译时确定，
		final String s1 = "Hello ";
		String str2 = s1 + "Java" + "的长度:10" ;
		System.out.println(str1 == str2);
		final int len = 10;
		// 1因为str3的值包含了变量，因此不能在编译时确定，
		String str3 = "Hello " + "Java" + "的长度:" + len;
		System.out.println(str1 == str3);
	}
}
