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
public class RawTypeTest2
{
	public static void main(String[] args)
	{
		// ����һ��RawType��List����
		List list = new ArrayList();
		// Ϊ�ü������3��Ԫ��
		list.add("���Java����");
		list.add("������Java EE��ҵӦ��ʵս");
		list.add("���Ajax����");
		// ��ԭʼ���͵�list���ϸ���������������List����
		List<Integer> intList = list;
		// ����intList���ϵ�ÿ��Ԫ��
		for (int i = 0 ; i < intList.size() ; i++)
		{
			Integer in = intList.get(i);    //��
			System.out.println(in);
		}
	}
}
