

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
public class ArrayTest
{
	public static void main(String[] args)
	{
		// ���þ�̬��ʼ����ʽ��ʼ����һ������
		String[] books = new String[]
		{
			"���Java����",
			"������Java EE��ҵӦ��ʵս",
			"���Ajax����",
			"���XML����"
		};
		// ���þ�̬��ʼ���ļ���ʽ��ʼ���ڶ�������
		String[] names =
		{
			"�����",
			"��˽�",
			"�׹Ǿ�"
		};
		// ���ö�̬��ʼ�����﷨��ʼ������������
		String[] strArr = new String[5];
		// ����3������ĳ���
		System.out.println("��һ������ĳ��ȣ�" + books.length);
		System.out.println("�ڶ�������ĳ��ȣ�" + names.length);
		System.out.println("����������ĳ��ȣ�" + strArr.length);
	}
}
