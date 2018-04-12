

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
	// 定义name、age两个实例变量
	String name;
	int age;
	// 使用构造器初始化name、age两个实例变量
	public Cat(String name , int age)
	{
		System.out.println("执行构造器");
		this.name = name;
		this.age = age;
	}
	{
		System.out.println("执行非静态初始化块");
		weight = 2.0;
	}
	// 定义时指定初始值
	double weight = 2.3;
	public String toString()
	{
		return "Cat[name=" + name
			+ ",age=" + age + ",weigth=" + weight + "]";
	}
}
public class InitTest
{
	public static void main(String[] args)
	{
		Cat cat = new Cat("kitty" , 2);       //①
		System.out.println(cat);
		Cat c2 = new Cat("Garfield" , 3);     //②
		System.out.println(c2);
	}
}
