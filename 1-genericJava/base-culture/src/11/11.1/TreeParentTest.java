
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
public class TreeParentTest
{
	public static void main(String[] args)
	{
		TreeParent<String> tp = new TreeParent<String>("root");
		TreeParent.Node root = tp.root();
		System.out.println(root);
		tp.addNode("�ڵ�1" , root);
		System.out.println("���������:" + tp.deep());
		tp.addNode("�ڵ�2" , root);
		// ��ȡ���ڵ�������ӽڵ�
		List<TreeParent.Node<String>> nodes = tp.children(root);
		System.out.println("���ڵ�ĵ�һ���ӽڵ㣺" + nodes.get(0));
		// Ϊ���ڵ�ĵ�һ���ӽڵ�����һ���ӽڵ�
		tp.addNode("�ڵ�3" , nodes.get(0));
		System.out.println("���������:" + tp.deep());
	}
}
