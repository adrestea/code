
import java.util.*;
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
public class ForEachErrorTest
{
	public static void main(String[] args)
	{
		List<String> books = new ArrayList<String>();
		books.add("���Java����");
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Ajax����");
		books.add("���XML����");
		// ʹ��foreachѭ������������Ԫ�أ�����book��Ϊѭ��������
		// book��ֵ���ڵ�ǰ���ڱ����ļ���Ԫ�ص�ֵ��
		// ��book�����Ǽ���Ԫ�ر���
		for (String book : books)
		{
			// ��ѭ����������ֵ
			book = "���Android����";
			System.out.println(book);
		}
		System.out.println(books);
	}
}
