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
public class RawTypeTest2
{
	public static void main(String[] args)
	{
		// 创建一个RawType的List集合
		List list = new ArrayList();
		// 为该集合添加3个元素
		list.add("疯狂Java讲义");
		list.add("轻量级Java EE企业应用实战");
		list.add("疯狂Ajax讲义");
		// 将原始类型的list集合赋给带泛型声明的List集合
		List<Integer> intList = list;
		// 遍历intList集合的每个元素
		for (int i = 0 ; i < intList.size() ; i++)
		{
			Integer in = intList.get(i);    //①
			System.out.println(in);
		}
	}
}
