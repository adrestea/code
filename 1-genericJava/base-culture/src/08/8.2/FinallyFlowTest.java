

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
public class FinallyFlowTest
{
	public static void main(String[] args)
	{
		int a = test();
		System.out.println(a);
	}
	public static int test()
	{
		int count = 5;
		try
		{
			// 因为finally块中包含了return语句，
			// 则下面的return语句不会立即返回
			return count++;
		}
		finally
		{
			System.out.println("finally块被执行");
			return ++count;
		}
	}
}