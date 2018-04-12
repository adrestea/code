

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
	public void display()
	{
		System.out.println(this.count);
	}
}
class Derived extends Base
{
	int count = 20;
	@Override
	public void display()
	{
		System.out.println(this.count);
	}
}
public class FieldAndMethodTest
{
	public static void main(String[] args)
	{
		// 声明、创建一个Base对象
		Base b = new Base();             //①
		// 直接访问count实例变量和通过display访问count实例变量
		System.out.println(b.count);
		b.display();
		// 声明、并创建一个Derived对象
		Derived d = new Derived();       //②
		// 直接访问count实例变量和通过display访问count实例变量
		System.out.println(d.count);
		d.display();
		// 声明一个Base变量，并将Derived对象赋给该变量
		Base bd = new Derived();         //③
		// 直接访问count实例变量和通过display访问count实例变量
		System.out.println(bd.count);
		bd.display();
		// 让d2b变量指向原d变量所指向的Dervied对象
		Base d2b = d;                    //④
		// 访问d2b所指对象的count实例变量
		System.out.println(d2b.count);
	}
}
