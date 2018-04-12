package org.crazyit.tools;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;
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
public class MyMathTest
{
	// ����Ҫ���Ե��࣬�����ɳ�Ա����
	MyMath math;
	// ÿ�����в�������֮ǰ�������и÷���
	@Before
	public void setUp()
	{
		math = new MyMath();
	}
	// ÿ�����в�������֮�󶼻����и÷���
	@After
	public void tearDown()
	{
		math = null;
	}
	// ����һԪһ�η��̵����
	@Test(expected=ArithmeticException.class)    //��
	public void testOneEquation()
	{
		System.out.println("����һԪ��ʽ���");
		// ���Ը÷������Ӧ��Ϊ-1.8
		assertEquals(math.oneEquation(5 , 9) , -1.8 , .00001);
		// ���Ե�a == 0ʱ�����
		assertEquals(math.oneEquation(0 , 9) , -1);
	}
	// ����һԪ���η��̵����
	@Test
	public void testTwoEquation()
	{
		double[] tmp = math.twoEquation(1 , -3 , 2);
		// ���Է��̵������⣬һ��Ϊ2����һ��Ϊ3��
		assertEquals("��һ�������" , tmp[0] , 2 , .00001);
		assertEquals("�ڶ��������" , tmp[1] , 3 , .00001);
	}
	// �������ڣ�ֱ�����в���������
	public static void main(String[] args)
	{
		// ���е����Ĳ���������
		JUnitCore.main("org.crazyit.tools.MyMathTest");
	}
}

