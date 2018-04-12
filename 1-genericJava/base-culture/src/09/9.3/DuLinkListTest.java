

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
public class DuLinkListTest
{
	public static void main(String[] args)
	{
		DuLinkList<String> list = new DuLinkList<String>();
		list.insert("aaaa" , 0);
		list.add("bbbb");
		list.insert("cccc" , 0);
		// ������Ϊ1������һ����Ԫ��
		list.insert("dddd" , 1);
		// ���˳�����Ա��Ԫ��
		System.out.println(list);
		// ɾ������Ϊ2����Ԫ��
		list.delete(2);
		System.out.println(list);
		System.out.println(list.reverseToString());
		// ��ȡcccc�ַ�����˳�����Ա��е�λ��
		System.out.println("cccc��˳�����Ա��е�λ�ã�"
			+ list.locate("cccc"));
		System.out.println("����������1����Ԫ�أ�"
			+ list.get(1));
		list.remove();
		System.out.println("����remove�����������:" + list);
		list.delete(0);
		System.out.println("����delete(0)�������:" + list);
	}
}
