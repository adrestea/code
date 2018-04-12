
import java.io.*;
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
public class CatchTest2
{
	public static void main(String[] args)
	{
		test1();
		test2();
	}
	public static void test1()
	{
		try(
			// ���ļ�������
			FileInputStream fis = new FileInputStream("a.bin");
			)
		{

			System.out.println("www.crazyit.org");
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	public static void test2()
	{
		try
		{
			// ����һ����
			Class.forName("org.crazyit.learning.Student");
			System.out.println("www.crazyit.org");
		}
		catch (ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}
}
