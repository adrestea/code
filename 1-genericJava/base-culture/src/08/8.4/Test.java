

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
// �����һ���ӿ�
interface Type1
{
	void test() throws ClassNotFoundException;
}
// ����ڶ����ӿ�
interface Type2
{
	void test() throws NoSuchMethodException;
}
// ��Test��ʵ��Type1��Type2�����ӿ�
public class Test implements Type1, Type2
{
	// ʵ��Type1��Type2�ӿ��������ĳ��󷽷�
	public void test()
	{
		System.out.println("www.crazyit.org");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.test();
	}
}
