

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
// ʵ��Cloneable�ӿ�
class Dog implements Cloneable
{
	private String name;
	private double weight;
	public Dog(String name , double weight)
	{
		System.out.println("�����в����Ĺ�����");
		this.name = name;
		this.weight = weight;
	}
	// ��дObject���clone����
	public Object clone()
	{
		Dog dog = null;
		try
		{
			// ����Object���clone������ɸ���
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
		System.out.println("Dog���󴴽���ɡ�");
		// ����clone()��������һ���µ�Java����
		Dog dog2 = (Dog)dog.clone();    //��
		// ���������ʵ������ֵ��ȫ��ͬ���������true
		System.out.println(dog.equals(dog));
		// ����������ͬ���������false
		System.out.println(dog == dog2);
	}
}
