

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
public class InstanceTest
{
	private String name;
	// 持有当前类的实例
	private InstanceTest instance;
	// 定义一个无参数的构造器
	public InstanceTest()
	{
	}
	// 定义有参数的构造器
	public InstanceTest(String name)
	{
		// 调用无参数的构造器初始化intance实例
		instance = new InstanceTest();
		instance.name = name;
	}
	// 重写toString()方法
	public String toString()
	{
		return "InstanceTest[instance="
			+ instance + "]";
	}
public static void main(String[] args)
{
	InstanceTest in = new InstanceTest();
	InstanceTest in2 = new InstanceTest("测试name");
	// 让两个对象相互引用
	in.instance = in2;
	in2.instance = in;
	System.out.println(in);
	System.out.println(in2);
}
}
