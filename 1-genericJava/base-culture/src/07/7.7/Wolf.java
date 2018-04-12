

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
class Animal
{
	public static void info()
	{
		System.out.println("Animal的Info方法");
	}
}
public class Wolf extends Animal
{
	public static void info()
	{
		System.out.println("Wolf的Info方法");
	}
	public static void main(String[] args)
	{
		// 定义第一个Animal变量，引用到一个Animal实例
		Animal a1 = new Animal();
		a1.info();
		// 定义第二个Animal变量，引用到一个Wolf实例
		Animal a2 = new Wolf();
		a2.info();
	}
}
