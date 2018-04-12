
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
		// ��׽IOExcetion�쳣
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		// ��׽FileNotFoundException�쳣
		catch(FileNotFoundException fex)      //��
		{
			fex.printStackTrace();
		}
		finally
		{
			// �򵥷�ʽ�ر���Դ
			if (fis != null)
			{
				fis.close();
			}
		}
	}
}
