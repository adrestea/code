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
class Singleton implements Serializable
{
	private static Singleton instance;
	private String name;
	private Singleton(String name)
	{
		System.out.println("�����в����Ĺ�����");
		this.name = name;
	}
	public static Singleton getInstance(String name)
	{
		// ֻ�е�instanceΪnullʱ�Ŵ����ö���
		if (instance == null)
		{
			instance = new Singleton(name);
		}
		return instance;
	}
	// �ṩreadResolve()����
	private Object readResolve()
		throws ObjectStreamException
	{
		// �õ����е�instanceʵ��
		return instance;
	}
}
public class SingletonTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ���þ�̬��������ȡWolfʵ��
		Singleton s = Singleton.getInstance("��̫��");
		System.out.println("Wolf���󴴽���ɡ�");
		Singleton s2 = null;
		try(
			// �������������
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("b.bin"));
			// ��������������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("b.bin"));
		)
		{
			// ���л����Java����
			oos.writeObject(s);
			oos.flush();
			// �����л��ָ�Java����
			s2 = (Singleton)ois.readObject();
			// ����������ͬ���������true
			System.out.println(s == s2);
		}
	}
}
