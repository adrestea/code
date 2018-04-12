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
public class AutoClose
{
	public static void main(String[] args)
		throws IOException,ClassNotFoundException
	{
		Wolf w = new Wolf("灰太狼");
		System.out.println("Wolf对象创建完成～");
		Wolf w2 = null;
		try(
			ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("a.bin"));
			ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("a.bin"));
			)
		{
			// 序列化输出Java对象
			oos.writeObject(w);
			oos.flush();
			// 反序列化恢复Java对象
			w2 = (Wolf)ois.readObject();
		}
	}
}
