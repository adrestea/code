

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
class Out
{
	class In
	{
		public void test()
		{
			System.out.println("In��test����");
		}
	}
	// ������A�̳�In��
	class A extends In
	{
	}
}
// ������OutTest�̳�In��
public class OutTest extends Out.In
{
	public OutTest()
	{
		// ��ΪOut.Inû���޲����Ĺ�����
		// ��ʽ���ø���ָ���Ĺ�����
		new Out().super();
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
