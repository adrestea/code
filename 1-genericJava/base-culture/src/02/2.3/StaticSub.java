

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
class StaticBase
{
	// ����һ��count�����
	static int count = 20;
}
public class StaticSub extends StaticBase
{
	// �����ٶ���һ��count�����
	static int count = 200;
	public void info()
	{
		System.out.println("���ʱ����count�����:"
			+ count);
		System.out.println("���ʸ����count�����:"
			+ StaticBase.count);
		System.out.println("���ʸ����count�����:"
			+ super.count);
	}
	public static void main(String[] args)
	{
		StaticSub sb = new StaticSub();
		sb.info();
	}
}
