

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
public class BreakPointTest
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 12;
		// 模拟一次复杂的计算
		int c = a << 2 * 3 + b - 20;      //①
		System.out.println(c);
		// 下面还要进行继续的计算
		//...
	}
}
