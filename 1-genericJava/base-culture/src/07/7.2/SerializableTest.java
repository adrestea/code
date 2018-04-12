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
class Wolf implements Serializable
{
	private String name;
	public Wolf(String name)
	{
		System.out.println("�����в����Ĺ�����");
		this.name = name;
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj.getClass() == Wolf.class)
		{
			Wolf target = (Wolf)obj;
			return target.name.equals(this.name);
		}
		return false;
	}
	public int hashCode()
	{
		return name.hashCode();
	}
}
public class SerializableTest
{
	public static void main(String[] args)
		throws Exception
	{
		Wolf w = new Wolf("��̫��");
		System.out.println("Wolf���󴴽���ɡ�");
		Wolf w2 = null;
		try(
			// �������������
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("a.bin"));
			// ��������������
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("a.bin"));
		)
		{
			// ���л����Java����
			oos.writeObject(w);
			oos.flush();
			// �����л��ָ�Java����
			w2 = (Wolf)ois.readObject();
			// ���������ʵ������ֵ��ȫ��ȣ��������true
			System.out.println(w.equals(w2));
			// ����������ͬ���������false
			System.out.println(w == w2);
		}
	}
}
