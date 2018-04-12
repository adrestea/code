
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
public class TreeSetRemove
{
	public static void main(String[] args)
	{
		TreeSet<String> set = new TreeSet<String>();
		set.add("111");
		set.add("222");
		set.add("333");
		System.out.println(set);
		for (Iterator<String> it = set.iterator(); it.hasNext(); )
		{
			String ele = it.next();
			// 迭代到最后一个元素时
			if (ele.equals("333"))     //①
			{
				// 直接删除集合最后一个元素
				set.remove(ele);
			}
		}
	}
}
