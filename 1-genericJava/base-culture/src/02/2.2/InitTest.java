

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
class Creature
{
	{
		System.out.println("Creature�ķǾ�̬��ʼ����");
	}
	// ���涨������������
	public Creature()
	{
		System.out.println("Creature�޲����Ĺ�����");
	}
	public Creature(String name)
	{
		// ʹ��this������һ�����صġ��޲����Ĺ�����
		this();
		System.out.println("Creature����nmae�����Ĺ�������name������"
			+ name);
	}
}
class Animal extends Creature
{
	{
		System.out.println("Animal�ķǾ�̬��ʼ����");
	}
	public Animal(String name)
	{
		super(name);
		System.out.println("Animal��һ�������Ĺ�������name������" + name);
	}
	public Animal(String name , int age)
	{
		// ʹ��this������һ�����صĹ�����
		this(name);
		System.out.println("Animal��2�������Ĺ���������age��" + age);
	}
}
class Wolf extends Animal
{
	{
		System.out.println("Wolf�ķǾ�̬��ʼ����");
	}
	public Wolf()
	{
		// ��ʽ���ø���Ĵ�2�������Ĺ�����
		super("��̫��", 3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public Wolf(double weight)
	{
		// ʹ��this������һ�����صĹ�����
		this();
		System.out.println("Wolf�Ĵ�weight�����Ĺ�������weight������"
			+ weight);
	}
}
public class InitTest
{
	public static void main(String[] args)
	{
		new Wolf(5.6);
	}
}
