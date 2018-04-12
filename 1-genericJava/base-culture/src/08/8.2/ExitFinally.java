
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
public class ExitFinally
{
	public static void main(String[] args)
		throws IOException
	{
		FileOutputStream fos = null;
		try
		{
			fos = new FileOutputStream("a.bin");
			System.out.println("�����������Դ��");
			System.exit(0);
		}
		finally
		{
			//ʹ��finally��ر���Դ
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
			System.out.println("����ر���������Դ��");
		}
	}
}
