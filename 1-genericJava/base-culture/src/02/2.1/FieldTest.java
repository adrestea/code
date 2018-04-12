

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
class Person
{
	String name;
	int age;
	static int eyeNum;
	public void info()
	{
		System.out.println("我的名字是：" + name
			+ "， 我的年龄是：" + age);
	}
}
public class FieldTest
{
	public static void main(String[] args)
	{
		// 类变量属于该类本身，只要该类初始化完成，
		// 程序即可使用类变量。
		Person.eyeNum = 2; 		  //①
		// 通过Person类访问eyeNum类变量
		System.out.println("Person的eyeNum属性："
			+ Person.eyeNum);
		// 创建第一个Person对象
		Person p = new Person();
		p.name = "猪八戒";
		p.age = 300;
		// 通过p访问Person类的eyeNum类变量
		System.out.println("通过p变量访问eyeNum类变量："
			+ p.eyeNum);           //②
		p.info();
		// 创建第二个Person对象
		Person p2 = new Person();
		p2.name = "孙悟空";
		p2.age = 500;
		p2.info();
		// 通过p2修改Person类的eyeNum类变量
		p2.eyeNum = 3;     		   //③
		// 分别通过p、p2和Person访问Person类的eyeNum类变量
		System.out.println("通过p变量访问eyeNum类变量："
			+ p.eyeNum);
		System.out.println("通过p2变量访问eyeNum类变量："
			+ p2.eyeNum);
		System.out.println("通过Person类访问eyeNum类变量："
			+ Person.eyeNum);
	}
}
