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
class Singleton implements Serializable
{
	private static Singleton instance;
	private String name;
	private Singleton(String name)
	{
		System.out.println("调用有参数的构造器");
		this.name = name;
	}
	public static Singleton getInstance(String name)
	{
		// 只有当instance为null时才创建该对象
		if (instance == null)
		{
			instance = new Singleton(name);
		}
		return instance;
	}
	// 提供readResolve()方法
	private Object readResolve()
		throws ObjectStreamException
	{
		// 得到已有的instance实例
		return instance;
	}
}
public class SingletonTest
{
	public static void main(String[] args)
		throws Exception
	{
		// 调用静态方法来获取Wolf实例
		Singleton s = Singleton.getInstance("灰太狼");
		System.out.println("Wolf对象创建完成～");
		Singleton s2 = null;
		try(
			// 创建对象输出流
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("b.bin"));
			// 创建对象输入流
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("b.bin"));
		)
		{
			// 序列化输出Java对象
			oos.writeObject(s);
			oos.flush();
			// 反序列化恢复Java对象
			s2 = (Singleton)ois.readObject();
			// 两个对象相同，下面输出true
			System.out.println(s == s2);
		}
	}
}
