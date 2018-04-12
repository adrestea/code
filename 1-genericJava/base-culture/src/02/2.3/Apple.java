

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
class Fruit
{
	String color = "δȷ����ɫ";
	// ����һ���������÷������ص��ø÷�����ʵ��
	public Fruit getThis()
	{
		return this;
	}
	public void info()
	{
		System.out.println("Fruit����");
	}
}
public class Apple extends Fruit
{
	// ��д����ķ���
	@Override
	public void info()
	{
		System.out.println("Apple����");
	}
	// ͨ��super���ø����Info()����
	public void AccessSuperInfo()
	{
		super.info();
	}
	// ���Է���super�ؼ��ִ��������
	public Fruit getSuper()
	{
		return super.getThis();
	}
	String color = "��ɫ";
	public static void main(String[] args)
	{
		// ����һ��Apple����
		Apple a = new Apple();
		// ����getSuper()������ȡApple���������super����
		Fruit f = a.getSuper();
		// �ж�a��f�Ĺ�ϵ
		System.out.println("a��f�����õĶ����Ƿ���ͬ��" + (a == f));
		System.out.println("����a�����ö����colorʵ��������" + a.color);
		System.out.println("����f�����ö����colorʵ��������" + f.color);
		// �ֱ�ͨ��a��f��������������info����
		a.info();
		f.info();
		// ����AccessSuperInfo�����ø����info()����
		a.AccessSuperInfo();
	}
}
