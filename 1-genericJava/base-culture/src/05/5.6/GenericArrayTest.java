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
public class GenericArrayTest
{
	public static void main(String[] args)
	{
		// �������ʵ�����ǲ������
		List<String>[] lsa = new List<String>[10];
		// ����ת��Ϊһ��Object����
		List[] oa = lsa;
		// ����һ��List����
		List<Integer> li = new ArrayList<Integer>();
		li.add(new Integer(3));
		// ��List<Integer>������Ϊoa�ĵڶ���Ԫ��
		// �������û���κξ���
		oa[1] = li;
		// �������Ҳ�������κξ��棬��������ClassCastException�쳣
		String s = lsa[1].get(0);  //��
	}
}
