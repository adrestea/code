

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
public class Cat
{
	private String name;
	private double weight;
	private String color;
	public void Cat()
	{
		this.name = "Garfield";
		this.weight = 20;
		this.color = "orange";
	}
	public void say()
	{
		System.out.println("体重：" + weight
			+ " , 毛色：" + color);
		System.out.println(name + "要有了三个愿望：'第一个是要猪肉卷，"
			+ "第二个还是猪肉卷，第三个，哦，你错啦，"
			+ "我想要更多的愿望，那样我就能得到更多的猪肉卷啦。'");
	}
	public static void main(String[] args)
	{
		Cat c = new Cat();     //①
		c.say();
	}
}
