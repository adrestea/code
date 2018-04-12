

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
public class PrimitiveArrayTest2
{
	public static void main(String[] args)
	{
		// 定义一个int[]类型的数组变量
		int[] iArr = null;
		// 只要不访问iArr的属性和方法，程序完全可以使用该数组变量
		System.out.println(iArr);          //①
		// 动态初始化数组，数组长度为5
		iArr = new int[5];
		// 只有当iArr指向有效的数组对象后，下面才可访问iArr的属性
		System.out.println(iArr.length);   //②
	}
}
