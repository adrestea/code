

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
public class RedBlackTreeTest
{
	public static void main(String[] args)
	{
		RedBlackTree<Integer> tree
			= new RedBlackTree<Integer>();
		//��ӽڵ�
		tree.add(5);
		tree.add(20);
		tree.add(10);
		tree.add(3);
		tree.add(8);
		tree.add(15);
		tree.add(30);
		System.out.println(tree.breadthFirst());
		//ɾ���ڵ�
		tree.remove(20);
		System.out.println(tree.breadthFirst());
//		System.out.println(tree.inIterator());

	}
}
