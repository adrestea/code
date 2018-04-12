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
public class AutoClose
{
	public static void main(String[] args)
		throws IOException,ClassNotFoundException
	{
		Wolf w = new Wolf("��̫��");
		System.out.println("Wolf���󴴽���ɡ�");
		Wolf w2 = null;
		try(
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("a.bin"));
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("a.bin"));
			)
		{
			// ���л����Java����
			oos.writeObject(w);
			oos.flush();
			// �����л��ָ�Java����
			w2 = (Wolf)ois.readObject();
		}
	}
}
