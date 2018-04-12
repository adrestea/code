

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
// 定义第一个接口
interface Type1
{
	void test() throws ClassNotFoundException;
}
// 定义第二个接口
interface Type2
{
	void test() throws NoSuchMethodException;
}
// 该Test类实现Type1、Type2两个接口
public class Test implements Type1, Type2
{
	// 实现Type1、Type2接口里声明的抽象方法
	public void test()
	{
		System.out.println("www.crazyit.org");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.test();
	}
}
