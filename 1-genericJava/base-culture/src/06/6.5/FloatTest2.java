

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
public class FloatTest2
{
	public static void main(String[] args)
	{
		final float f1 = 999999999;
		System.out.println(f1);
		System.out.println(f1 + 20);
		// 下面语句输出true
		System.out.println(f1 == f1 + 20);
		System.out.println(f1 + 50);
		// 下面语句输出false
		System.out.println(f1 == f1 + 50);
	}
}
