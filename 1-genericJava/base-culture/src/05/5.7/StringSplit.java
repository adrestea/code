

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
public class StringSplit
{
	public static void main(String[] args)
	{
		String str = "java.is.funny.www.crazyit.org";
		// 将这个字符串以点号（.）分割成多个字符
//		String[] strArr = str.split(".");
		String[] strArr = str.split("\\.");
		for (String s : strArr )
		{
			System.out.println(s);
		}
	}
}
