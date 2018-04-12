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
class Wolf implements Serializable
{
	private String name;
	public Wolf(String name)
	{
		System.out.println("调用有参数的构造器");
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
		Wolf w = new Wolf("灰太狼");
		System.out.println("Wolf对象创建完成～");
		Wolf w2 = null;
		try(
			// 创建对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("a.bin"));
			// 创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("a.bin"));
		)
		{
			// 序列化输出Java对象
			oos.writeObject(w);
			oos.flush();
			// 反序列化恢复Java对象
			w2 = (Wolf)ois.readObject();
			// 两个对象的实例变量值完全相等，下面输出true
			System.out.println(w.equals(w2));
			// 两个对象不相同，下面输出false
			System.out.println(w == w2);
		}
	}
}
