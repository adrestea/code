

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
class Cat
{
	// ʹ��һ��������¼һ�������˶��ٸ�ʵ��
	private static long instanceCount = 0;
	public Cat()
	{
		System.out.println("ִ���޲����Ĺ�����");
		instanceCount++;
	}
	public static long getInstanceCount()
	{
		return instanceCount;
	}
}
public class CatTest
{
	public static void main(String[] args)
	{
		// ʹ��ѭ������10��Cat����
		for (int i = 0; i < 10; i++)
			Cat cat = new Cat();
		System.out.println(Cat.getInstanceCount());
	}
}