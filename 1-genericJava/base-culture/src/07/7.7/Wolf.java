

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
class Animal
{
	public static void info()
	{
		System.out.println("Animal��Info����");
	}
}
public class Wolf extends Animal
{
	public static void info()
	{
		System.out.println("Wolf��Info����");
	}
	public static void main(String[] args)
	{
		// �����һ��Animal���������õ�һ��Animalʵ��
		Animal a1 = new Animal();
		a1.info();
		// ����ڶ���Animal���������õ�һ��Wolfʵ��
		Animal a2 = new Wolf();
		a2.info();
	}
}
