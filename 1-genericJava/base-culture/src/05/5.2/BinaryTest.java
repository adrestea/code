

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
public class BinaryTest
{
	public static void main(String[] args)
	{
		// 采用二进制整数形式定义两个整数
		int it = 0b1010_1010;
		byte bt = (byte)0b1010_1010;
		System.out.println(it == bt);   //①
	}
}
