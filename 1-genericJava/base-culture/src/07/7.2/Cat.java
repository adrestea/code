

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
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
		System.out.println("���أ�" + weight
			+ " , ëɫ��" + color);
		System.out.println(name + "Ҫ��������Ը����'��һ����Ҫ�����"
			+ "�ڶ��������������������Ŷ���������"
			+ "����Ҫ�����Ը���������Ҿ��ܵõ���������������'");
	}
	public static void main(String[] args)
	{
		Cat c = new Cat();     //��
		c.say();
	}
}
