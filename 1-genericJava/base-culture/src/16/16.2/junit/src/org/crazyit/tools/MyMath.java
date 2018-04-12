package org.crazyit.tools;

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
public class MyMath
{
	/**
	 * ��һԪһ�η���a * x + b = 0�ĸ���
	 * @param a �����б�����ϵ����
	 * @param b �����еĳ�����
	 * return ���̵ĸ�
	 */
	public double oneEquation(double a , double b)
	{
		// ���a = 0 ��������޷���⡣
		if (a == 0)
		{
			System.out.println("��������");
			throw new ArithmeticException("��������");
		}
		// ���ط��̵ĸ�
		else
		{
			return -b/a;
		}
	}
	/**
	 * ��һԪ���η���a * x * x + b * x + c = 0�ĸ���
	 * @param a �����б��������ݵ�ϵ����
	 * @param b �����б�����ϵ����
	 * @param b �����г�����
	 * return ���̵ĸ�
	 */
	public double[] twoEquation(double a , double b , double c)
	{
		double[] result ;
		// ���a == 0 �����һ�η���
		if (a == 0)
		{
			throw new ArithmeticException("��������");
		}
		// ��������Χ���޸�
		else if(b * b - 4 * a * c < 0)
		{
			throw new ArithmeticException("��������������Χ���޽�");
		}
		// ������Ψһ�ĸ�
		else if(b * b - 4 * a * c == 0)
		{
			System.out.println("��������Ψһ��");
			result = new double[1];
			// ʹ�����鷵�ط��̵ĸ�
			result[0] = -b / (2 * a);
			return result;
		}
		// ������������
		else
		{
			System.out.println("��������������");
			result = new double[2];
			// ʹ�����鷵�ط��̵�������
			result[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 / a;
			result[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 /a;
			return result;
		}
	}
}
