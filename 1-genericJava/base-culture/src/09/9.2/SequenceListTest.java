

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
public class SequenceListTest
{
	public static void main(String[] args)
	{
		SequenceList<String> list = new SequenceList<String>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		// ������Ϊ1������һ����Ԫ��
		list.insert("dddd" , 1);
		// ���˳�����Ա��Ԫ��
		System.out.println(list);
		// ɾ������Ϊ2����Ԫ��
		list.delete(2);
		System.out.println(list);
		// ��ȡcccc�ַ�����˳�����Ա��е�λ��
		System.out.println("cccc��˳�����Ա��е�λ�ã�"
			+ list.locate("cccc"));
	}
}
