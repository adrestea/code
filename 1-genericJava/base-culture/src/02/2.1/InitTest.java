

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
class Cat
{
	// ����name��age����ʵ������
	String name;
	int age;
	// ʹ�ù�������ʼ��name��age����ʵ������
	public Cat(String name , int age)
	{
		System.out.println("ִ�й�����");
		this.name = name;
		this.age = age;
	}
	{
		System.out.println("ִ�зǾ�̬��ʼ����");
		weight = 2.0;
	}
	// ����ʱָ����ʼֵ
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
		Cat cat = new Cat("kitty" , 2);       //��
		System.out.println(cat);
		Cat c2 = new Cat("Garfield" , 3);     //��
		System.out.println(c2);
	}
}
