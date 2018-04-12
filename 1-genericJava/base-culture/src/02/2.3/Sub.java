

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
class Base
{
	int count = 2;
}
class Mid extends Base
{
	int count = 20;
}
public class Sub extends Mid
{
	int count = 200;
	public static void main(String[] args)
	{
		// 创建一个Sub对象
		Sub s = new Sub();
		// 将Sub对象向上转型后赋为Mid、Base类型的变量
		Mid s2m = s;
		Base s2b = s;
		// 分别通过3个变量来访问count实例变量
		System.out.println(s.count);
		System.out.println(s2m.count);
		System.out.println(s2b.count);
	}
}
