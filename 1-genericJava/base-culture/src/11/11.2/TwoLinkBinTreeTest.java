

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
public class TwoLinkBinTreeTest
{
	public static void main(String[] args)
	{
		TwoLinkBinTree<String> binTree = new TwoLinkBinTree<>("���ڵ�");
		// ������ӽڵ�
		TwoLinkBinTree.TreeNode tn1 = binTree.addNode(binTree.root()
			,  "�ڶ�����ڵ�" , true);
		TwoLinkBinTree.TreeNode tn2 = binTree.addNode(binTree.root()
			, "�ڶ����ҽڵ�" ,false );
		TwoLinkBinTree.TreeNode tn3 = binTree.addNode(tn2
			, "��������ڵ�" , true);
		TwoLinkBinTree.TreeNode tn4 = binTree.addNode(tn2
			, "�������ҽڵ�" , false);
		TwoLinkBinTree.TreeNode tn5 = binTree.addNode(tn3
			, "���Ĳ���ڵ�" , true);
		System.out.println("tn2�����ӽڵ㣺" + binTree.leftChild(tn2));
		System.out.println("tn2�����ӽڵ㣺" + binTree.rightChild(tn2));
		System.out.println(binTree.deep());
	}
}
