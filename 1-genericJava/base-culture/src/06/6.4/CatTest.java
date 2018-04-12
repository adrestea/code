

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
class Cat
{
	// 使用一个变量记录一共创建了多少个实例
	private static long instanceCount = 0;
	public Cat()
	{
		System.out.println("执行无参数的构造器");
		instanceCount++;
	}
	public static long getInstanceCount()
	{
		return instanceCount;
	}
}
public class CatTest
{
	public static void main(String[] args)
	{
		// 使用循环创建10个Cat对象
		for (int i = 0; i < 10; i++)
			Cat cat = new Cat();
		System.out.println(Cat.getInstanceCount());
	}
}