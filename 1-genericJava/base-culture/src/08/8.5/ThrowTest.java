
import java.io.*;
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
public class ThrowTest
{
	public static void main(String[] args)
		// Java 6认为①号代码可能抛出Exception，
		// 因此该方法需要声明抛出Exception
		// Java 7会检查①号代码可能抛出异常的实际类型，
		// 因此该方法只需声明抛出FileNotFoundException即可。
		throws FileNotFoundException
	{
		try
		{
			new FileOutputStream("a.txt");
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
			throw ex;     //①
		}
	}
}

