
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
public class ExitHook
{
	public static void main(String[] args)
		throws IOException
	{
		final FileOutputStream fos;
		fos = new FileOutputStream("a.bin");
		System.out.println("程序打开物理资源！");
		// 为系统注册关闭钩子
		Runtime.getRuntime().addShutdownHook(
			new Thread()
			{
				public void run()
				{
					// 使用关闭钩子来关闭资源
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
			});
		System.exit(0);
	}
}
