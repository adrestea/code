

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
public class FinallyFlowTest2
{
	public static void main(String[] args)
	{
		int a = test();
		System.out.println(a);
	}
	public static int test()
	{
		int count = 5;
		try
		{
			// ��Ϊfinally���а�����return��䣬
			// ��������쳣����������ֹ����
			int a = 20 / 0;
		}
		finally
		{
			System.out.println("finally�鱻ִ��");
			return count;
		}
	}
}