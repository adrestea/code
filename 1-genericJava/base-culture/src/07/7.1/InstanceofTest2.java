

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
public class InstanceofTest2
{
	public static void main(String[] args)
	{
		Object str = "疯狂Java讲义";
		// 执行强制类型转换
		// 让math引用原来str引用的对象
		Math math = (Math)str;          //①
		System.out.println("字符串是否是String的实例："
			+ (math instanceof String));//②
	}
}
