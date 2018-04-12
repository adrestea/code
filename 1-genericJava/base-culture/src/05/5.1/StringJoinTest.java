

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
public class StringJoinTest
{
	public static void main(String[] args)
	{
		String str1 = "Hello Java的长度:10";
		// 虽然str2的值不是直接量，但因为str2的值可以在编译时确定，
		// 因此str2也会直接引用字符串池中对应的字符串
		String str2 = "Hello " + "Java" + "的长度:" + 10;
		System.out.println(str1 == str2);
	}
}
