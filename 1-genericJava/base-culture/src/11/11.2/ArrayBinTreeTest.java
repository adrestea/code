

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
public class ArrayBinTreeTest
{
	public static void main(String[] args)
	{
		ArrayBinTree<String> binTree =
			new ArrayBinTree<String>(4, "��");
		binTree.add(0 , "�ڶ������ӽڵ�" , false);
		binTree.add(2 , "���������ӽڵ�" , false);
		binTree.add(6 , "���Ĳ����ӽڵ�" , false);
		System.out.println(binTree);
	}
}
