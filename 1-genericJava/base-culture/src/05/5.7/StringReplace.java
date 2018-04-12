

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
public class StringReplace
{
	public static void main(String[] args)
	{
		String clazz = "org.crazyit.auction.model.Item";
		// 使用replace就比较简单
		String path1 = clazz.replace("." , "\\");
		System.out.println(path1);
		// 使用replaceAll复杂多了，需要对.和\进行转义
		String path2 = clazz.replaceAll("\\." , "\\\\");
		System.out.println(path2);
	}
}
