
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
public class ExitFinally
{
	public static void main(String[] args)
		throws IOException
	{
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("a.bin");
			System.out.println("程序打开物理资源！");
			System.exit(0);
		}
		finally
		{
			//使用finally块关闭资源
			if (fos != null)
			{
				try
				{
					fos.close();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
			System.out.println("程序关闭了物理资源！");
		}
	}
}
