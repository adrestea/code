

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
public class FloatCount2
{
	public static void main(String[] args)
	{
		final int START = 999999999;
		// 尝试循环20次
		for (float i = START ; i < START + 20  ; i ++)
		{
			System.out.println("i的值："
				+ i + new java.util.Date());
		}
	}
}
