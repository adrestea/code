
import java.util.*;
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
public class ForEachErrorTest
{
	public static void main(String[] args)
	{
		List<String> books = new ArrayList<String>();
		books.add("疯狂Java讲义");
		books.add("轻量级Java EE企业应用实战");
		books.add("疯狂Ajax讲义");
		books.add("疯狂XML讲义");
		// 使用foreach循环来遍历数组元素，其中book作为循环计数器
		// book的值等于当前正在遍历的集合元素的值，
		// 但book并不是集合元素本身。
		for (String book : books)
		{
			// 对循环计数器赋值
			book = "疯狂Android讲义";
			System.out.println(book);
		}
		System.out.println(books);
	}
}
