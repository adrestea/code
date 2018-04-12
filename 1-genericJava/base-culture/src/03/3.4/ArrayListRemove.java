
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
public class ArrayListRemove
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		list.add("333");
		for (Iterator<String> it = list.iterator(); it.hasNext() ; )
		{
			String ele = it.next();
			System.out.println(ele);
			// 当迭代倒数第二个元素时
			if (ele.equals("222"))    //①
			{
				// 直接删除集合中倒数第二个元素
				list.remove(ele);
			}
		}
	}
}
