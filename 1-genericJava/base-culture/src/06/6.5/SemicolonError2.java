

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
public class SemicolonError2
{
	public static void main(String[] args)
	{
		String[] books = {
			"���Java����",
			"������Java EE��ҵӦ��ʵս",
			"���XML����"
		};
		int i = 0;
		//����books����
		for ( ; i < books.length ; i++);
		{
			System.out.println("��i��Ԫ�ص�ֵ��" + books[i]);
		}
	}
}
