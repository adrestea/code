

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
	// ����name��weight����ʵ������
	private String name;
	private double weight;
	public Wolf2(String name , double weight)
	{
		// Ϊname��weight����ʵ��������ֵ
		this.name = name;
		this.weight = weight;
	}
	// ��д�����getDesc()����
	@Override
	public String getDesc()
	{
		return "Wolf[name=" + name + " , weight="
			+ weight + "]";
	}
	public static void main(String[] args)
	{
		System.out.println(new Wolf2("��̫��" , 32.3));
	}
}
