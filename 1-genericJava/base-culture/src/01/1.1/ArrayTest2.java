

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
public class ArrayTest2
{
	public static void main(String[] args)
	{
		// 采用静态初始化方式初始化第一个数组
		String[] books = new String[]
		{
			"疯狂Java讲义",
			"轻量级Java EE企业应用实战",
			"疯狂Ajax讲义",
			"疯狂XML讲义"
		};
		// 采用静态初始化的简化形式初始化第二个数组
		String[] names =
		{
			"孙悟空",
			"猪八戒",
			"白骨精"
		};
		// 采用动态初始化的语法初始化第三个数组
		String[] strArr = new String[5];
		// 访问3个数组的长度
		System.out.println("第一个数组的长度：" + books.length);
		System.out.println("第二个数组的长度：" + names.length);
		System.out.println("第三个数组的长度：" + strArr.length);
		// 让books数组变量、strArr数组变量指向names所引用的数组
		books = names;
		strArr = names;
		System.out.println("--------------");
		System.out.println("books数组的长度：" + books.length);
		System.out.println("strArr数组的长度：" + strArr.length);
		// 改变books数组变量所引用的数组的第二个元素值。
		books[1] = "唐僧";
		System.out.println("names数组的第二个元素是：" + books[1]);
	}
}
