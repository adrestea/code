

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
public class LinkListTest
{
	public static void main(String[] args)
	{
		LinkList<String> list = new LinkList<String>();
		list.insert("aaaa" , 0);
		list.add("bbbb");
		list.add("cccc");
		// ������Ϊ1������һ����Ԫ��
		list.insert("dddd" , 1);
		// ���˳�����Ա��Ԫ��
		System.out.println(list);
		// ɾ������Ϊ2����Ԫ��
		list.delete(2);
		System.out.println(list);
		// ��ȡcccc�ַ����������е�λ��
		System.out.println("cccc�������е�λ�ã�"
			+ list.locate("cccc"));
		System.out.println("����������2����Ԫ�أ�"
			+ list.get(2));
	}
}
