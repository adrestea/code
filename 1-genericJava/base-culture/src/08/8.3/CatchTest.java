
import java.io.*;
/**
 * Description:
 * <br/>ÍøÕ¾: <a href="http://www.crazyit.org">·è¿ñJavaÁªÃË</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class CatchTest
{
	public static void main(String[] args)
	{
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	public static void test1()
	{
		try
		{
			System.out.println("www.crazyit.org");
		}
		catch (IndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void test2()
	{
		try
		{
			System.out.println("www.crazyit.org");
		}
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void test3()
	{
		try
		{
			System.out.println("www.crazyit.org");
		}
		catch (IOException ex)     //¢Ù
		{
			ex.printStackTrace();
		}
	}
	public static void test4()
	{
		try
		{
			System.out.println("www.crazyit.org");
		}
		catch (ClassNotFoundException ex)   //¢Ú
		{
			ex.printStackTrace();
		}
	}
	public static void test5()
	{
		try
		{
			System.out.println("www.crazyit.org");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
