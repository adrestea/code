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
public class GenericArrayTest
{
	public static void main(String[] args)
	{
		// 下面代码实际上是不允许的
		List<String>[] lsa = new List<String>[10];
		// 向上转换为一个Object数组
		List[] oa = lsa;
		// 创建一个List集合
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(3));
		// 将List<Integer>对象作为oa的第二个元素
		// 下面代码没有任何警告
		oa[1] = li;
		// 下面代码也不会有任何警告，但将引起ClassCastException异常
		String s = lsa[1].get(0);  //①
	}
}
