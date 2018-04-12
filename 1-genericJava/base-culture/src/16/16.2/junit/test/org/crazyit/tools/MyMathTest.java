package org.crazyit.tools;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
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
public class MyMathTest
{
	// 将需要测试的类，声明成成员变量
	MyMath math;
	// 每次运行测试用例之前都会运行该方法
	@Before
	public void setUp()
	{
		math = new MyMath();
	}
	// 每次运行测试用例之后都会运行该方法
	@After
	public void tearDown()
	{
		math = null;
	}
	// 测试一元一次方程的求解
	@Test(expected=ArithmeticException.class)    //①
	public void testOneEquation()
	{
		System.out.println("测试一元方式求解");
		// 断言该方程求解应该为-1.8
		assertEquals(math.oneEquation(5 , 9) , -1.8 , .00001);
		// 断言当a == 0时的情况
		assertEquals(math.oneEquation(0 , 9) , -1);
	}
	// 测试一元二次方程的求解
	@Test
	public void testTwoEquation()
	{
		double[] tmp = math.twoEquation(1 , -3 , 2);
		// 断言方程的两个解，一个为2，另一个为3。
		assertEquals("第一个解出错：" , tmp[0] , 2 , .00001);
		assertEquals("第二个解出错：" , tmp[1] , 3 , .00001);
	}
	// 程序的入口，直接运行测试用例。
	public static void main(String[] args)
	{
		// 运行单个的测试用例。
		JUnitCore.main("org.crazyit.tools.MyMathTest");
	}
}

