

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
public class SwitchTest
{
	public static void main(String[] args)
	{
		int a = 5;
		switch (a + 1.2 + 0.8)
//		switch ((int)(a + 1.2 + 0.8))
		{
			case 6:
				System.out.println("�������6");
				break;
			case 7:
				System.out.println("�������7");
				break;
			case 8:
				System.out.println("�������8");
				break;
			default:
				System.out.println("�����������ֵ");
		}
	}
}
