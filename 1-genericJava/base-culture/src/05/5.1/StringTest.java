

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
public class StringTest
{
	public static void main(String[] args)
	{
		// str1的值是字符串直接量，
		// 因此str1指向字符串缓存池中"Hello Java"字符串
		String str1 = "Hello Java";
		// str2也指向字符串缓存池中"Hello Java"字符串
		String str2 = "Hello Java";
		// 下面程序将输出true
		System.out.println(str1 == str2);
	}
}
