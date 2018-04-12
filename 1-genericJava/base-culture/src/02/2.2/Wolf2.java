

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
	public String getDesc()
	{
		return "Animal";
	}
	public String toString()
	{
		return getDesc();
	}
}
public class Wolf2 extends Animal
{
	// 定义name、weight两个实例变量
	private String name;
	private double weight;
	public Wolf2(String name , double weight)
	{
		// 为name、weight两个实例变量赋值
		this.name = name;
		this.weight = weight;
	}
	// 重写父类的getDesc()方法
	@Override
	public String getDesc()
	{
		return "Wolf[name=" + name + " , weight="
			+ weight + "]";
	}
	public static void main(String[] args)
	{
		System.out.println(new Wolf2("灰太狼" , 32.3));
	}
}
