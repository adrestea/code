

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
public class ConversionTest
{
	public static void main(String[] args)
	{
		Object obj = "Hello";
		// obj变量的编译类型为Object，是String类型的父类，
		// 可以强制类型转换，而且obj变量实际上引用的也是String对象，
		// 所以运行时也正常
		String objStr = (String)obj;    //①
		System.out.println(objStr);
		// 定义一个objPri变量，编译类型为Object，实际类型为Integer
		Object objPri = new Integer(5);
		// objPri变量的编译类型为Object，是String类型的父类，
		// 可以强制类型转换，但obj变量实际上引用的是Integer对象，
		// 所以下面代码运行时引发ClassCastException异常
		String str = (String)objPri;    //②
		String s = "疯狂Java讲义";
		// 因为s的编译时类型是String，String不是Math类型
		// String也不是Math的子类，也不是Math的父类，
		// 所以下面代码导致编译错误
		Math m = (Math)s;                //③
	}
}
