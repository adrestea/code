
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
public class ExitHook
{
	public static void main(String[] args)
		throws IOException
	{
		final FileOutputStream fos;
		fos = new FileOutputStream("a.bin");
		System.out.println("�����������Դ��");
		// Ϊϵͳע��رչ���
		Runtime.getRuntime().addShutdownHook(
			new Thread()
			{
				public void run()
				{
					// ʹ�ùرչ������ر���Դ
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
			});
		System.exit(0);
	}
}
