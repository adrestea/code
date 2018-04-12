
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
public class CatchSequenceTest
{
	public static void main(String[] args)
		throws Exception
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("a.bin");
			fis.read();
		}
		// 捕捉IOExcetion异常
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		// 捕捉FileNotFoundException异常
		catch(FileNotFoundException fex)      //①
		{
			fex.printStackTrace();
		}
		finally
		{
			// 简单方式关闭资源
			if (fis != null)
			{
				fis.close();
			}
		}
	}
}
