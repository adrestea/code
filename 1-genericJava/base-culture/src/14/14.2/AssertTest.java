

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
public class AssertTest
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 12;
		// 模拟一次复杂的计算
		int c = (a << 2) * 3 + b - 20;
		// 断言a > 3
		assert c > 3;
		// 断言a == 52
		assert c == 52;
		// 断言a < 52,否则显示:"a不小于52，且a的值为：" + c
		assert c < 52 : "c不小于52，且c的值为：" + c;
		System.out.println("==断言之后==");
	}
}