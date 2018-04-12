

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
public class StringCompare
{
	public static void main(String[] args)
	{
		String s1 = new String("abc");
		String s2 = new String("z");
		String s3 = new String("abc");
		// 通过compareTo比较字符串的大小
		if (s1.compareTo(s3) == 0)
		{
			System.out.println("s1和s3包含的字符序列相等");
		}
		if (s1.compareTo(s2) < 0)
		{
			System.out.println("s1小于s2");
		}
		// 通过equals比较字符串包含的字符序列是否相同
		System.out.println("s1和s3包含的字符序列是否相同:"
			+ s1.equals(s3));
		// 通过==运算符比较两个字符串引用变量是否指向同一个字符串对象
		System.out.println("s1和s3所指的字符串是否相同:"
			+ (s1 == s3));
	}
}
