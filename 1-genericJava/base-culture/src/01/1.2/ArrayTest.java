

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
	double weight;
	int age;
	public Cat(double weight , int age)
	{
		this.weight = weight;
		this.age = age;
	}
}
public class ArrayTest
{
	public static void main(String[] args)
	{
		// ���壬����̬��ʼ��һ��int[]����
		int[] pos = new int[5];
		// ����ѭ��Ϊÿ������Ԫ�ظ�ֵ
		for (int i = 0; i < pos.length ; i++ )
		{
			pos[i] = (i + 1) * 2;
		}
		// ����pos�����Ԫ����˵����������ȫ��ͬ����ͨ����
		// ���漴�ɽ�����Ԫ�ص�ֵ����int������
		// Ҳ�ɽ�int������ֵ��������Ԫ��
		int a = pos[1];
		int b = 20;
		pos[2] = b;             //��
		// ���壬����̬��ʼ��һ��Cat[]����
		Cat[] cats = new Cat[2];
		cats[0] = new Cat(3.34, 2);
		// ��cats����ĵ�1��Ԫ�ص�ֵ����c1��
		Cat c1 = cats[0];
		Cat c2 = new Cat(4.3, 3);
		// ��c2��ֵ����cats����ĵ�2��Ԫ��
		cats[1] = c2;             //��
	}
}
