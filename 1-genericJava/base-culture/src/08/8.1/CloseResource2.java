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
public class CloseResource2
{
	public static void main(String[] args)
		throws Exception
	{
		Wolf w = new Wolf("��̫��");
		System.out.println("Wolf���󴴽���ɡ�");
		Wolf w2 = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try
		{
			// �������������
			oos = new ObjectOutputStream(
				new FileOutputStream("a.bin"));
			// ��������������
			ois = new ObjectInputStream(
				new FileInputStream("a.bin"));
			// ���л����Java����
			oos.writeObject(w);
			oos.flush();
			// �����л��ָ�Java����
			w2 = (Wolf)ois.readObject();
		}
		// ʹ��finlly����������Դ
		finally
		{
			if (oos != null)
			{
				oos.close();
			}
			if (ois != null)
			{
				ois.close();
			}
		}
	}
}
