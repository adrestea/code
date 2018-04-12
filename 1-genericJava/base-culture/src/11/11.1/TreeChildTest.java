
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
public class TreeChildTest
{
	public static void main(String[] args)
	{
		TreeChild<String> tp = new TreeChild<String>("root");
		TreeChild.Node root = tp.root();
		System.out.println("���ڵ㣺" + root);
		tp.addNode("�ڵ�1" , root);
		tp.addNode("�ڵ�2" , root);
		tp.addNode("�ڵ�3" , root);
		System.out.println("����ӽڵ��ĸ��ڵ㣺" + root);
		System.out.println("���������:" + tp.deep());
		// ��ȡ���ڵ�������ӽڵ�
		List<TreeChild.Node<String>> nodes = tp.children(root);
		System.out.println("���ڵ�ĵ�һ���ӽڵ㣺" + nodes.get(0));
		// Ϊ���ڵ�ĵ�һ���ӽڵ�����һ���ӽڵ�
		tp.addNode("�ڵ�4" , nodes.get(0));
		System.out.println("���ڵ�ĵ�һ���ӽڵ㣺" + nodes.get(0));
		System.out.println("���������:" + tp.deep());
	}
}
