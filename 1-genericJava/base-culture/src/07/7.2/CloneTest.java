

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
// 实现Cloneable接口
class Dog implements Cloneable
{
	private String name;
	private double weight;
	public Dog(String name , double weight)
	{
		System.out.println("调用有参数的构造器");
		this.name = name;
		this.weight = weight;
	}
	// 重写Object类的clone方法
	public Object clone()
	{
		Dog dog = null;
		try
		{
			// 调用Object类的clone方法完成复制
			dog = (Dog) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return dog;
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj.getClass() == Dog.class)
		{
			Dog target = (Dog)obj;
			return target.name.equals(this.name)
				&& target.weight == this.weight;
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode() * 17
			+ (int)weight;
	}
}
public class CloneTest
{
	public static void main(String[] args)
	{
		Dog dog = new Dog("Blot" , 9.8);
		System.out.println("Dog对象创建完成～");
		// 采用clone()方法复制一个新的Java对象。
		Dog dog2 = (Dog)dog.clone();    //①
		// 两个对象的实例变量值完全相同，下面输出true
		System.out.println(dog.equals(dog));
		// 两个对象不相同，下面输出false
		System.out.println(dog == dog2);
	}
}
