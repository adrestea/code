package org.crazyit.tools;

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
public class MyMath
{
	/**
	 * 求一元一次方程a * x + b = 0的根。
	 * @param a 方程中变量的系数。
	 * @param b 方程中的常量。
	 * return 方程的根
	 */
	public double oneEquation(double a , double b)
	{
		// 如果a = 0 ，则防范无法求解。
		if (a == 0)
		{
			System.out.println("参数错误");
			throw new ArithmeticException("参数错误");
		}
		// 返回方程的根
		else
		{
			return -b/a;
		}
	}
	/**
	 * 求一元二次方程a * x * x + b * x + c = 0的根。
	 * @param a 方程中变量二次幂的系数。
	 * @param b 方程中变量的系量。
	 * @param b 方程中常量。
	 * return 方程的根
	 */
	public double[] twoEquation(double a , double b , double c)
	{
		double[] result ;
		// 如果a == 0 ，变成一次方程
		if (a == 0)
		{
			throw new ArithmeticException("参数错误");
		}
		// 有理数范围内无根
		else if(b * b - 4 * a * c < 0)
		{
			throw new ArithmeticException("方程在有理数范围内无解");
		}
		// 方程有唯一的根
		else if(b * b - 4 * a * c == 0)
		{
			System.out.println("方程在有唯一解");
			result = new double[1];
			// 使用数组返回方程的根
			result[0] = -b / (2 * a);
			return result;
		}
		// 方程有两个根
		else
		{
			System.out.println("方程在有两个解");
			result = new double[2];
			// 使用数组返回方程的两个根
			result[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 / a;
			result[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 /a;
			return result;
		}
	}
}
