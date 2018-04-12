

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
public class ImmutableString
{
	public static void main(String[] args)
	{
		// 定义一个字符串变量
		String str = "Hello ";       //①
		System.out.println(System.identityHashCode(str));
		// 进行字符串连接运算
		str = str + "Java";          //②
		System.out.println(System.identityHashCode(str));
		// 进行字符串连接运算
		str = str + ", crazyit.org"; //③
		System.out.println(System.identityHashCode(str));
	}
}
