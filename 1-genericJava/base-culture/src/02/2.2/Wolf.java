

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
	// desc实例变量保存对象toString方法的返回值
	private String desc;
	public Animal()
	{
		// 调用getDesc()方法初始化desc实例变量
		this.desc = getDesc();            //②
	}
	public String getDesc()
	{
		return "Animal";
	}
	public String toString()
	{
		return desc;
	}
}
public class Wolf extends Animal
{
	// 定义name、weight两个实例变量
	private String name;
	private double weight;
	public Wolf(String name , double weight)
	{
		// 为name、weight两个实例变量赋值
		this.name = name;                 //③
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
		System.out.println(new Wolf("灰太狼" , 32.3)); //①
	}
}
