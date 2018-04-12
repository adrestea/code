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
public class SortedBinTree<T extends Comparable>
{
	static class Node
	{
		Object data;
		Node parent;
		Node left;
		Node right;
		public Node(Object data , Node parent
			, Node left , Node right)
		{
			this.data = data;
			this.parent = parent;
			this.left = left;
			this.right = right;
		}
		public String toString()
		{
			return "[data=" + data + "]";
		}
		public boolean equals(Object obj)
		{
			if (this == obj)
			{
				return true;
			}
			if (obj.getClass() == Node.class)
			{
				Node target = (Node)obj;
				return data.equals(target.data)
					&& left == target.left
					&& right == target.right
					&& parent == target.parent;
			}
			return false;
		}
	}
	private Node root;
	// �������������ڴ������������
	public SortedBinTree()
	{
		root = null;
	}
	public SortedBinTree(T o)
	{
		root = new Node(o , null , null , null);
	}
	// ��ӽڵ�
	@SuppressWarnings("unchecked")
	public void add(T ele)
	{
		// ������ڵ�Ϊnull
		if (root == null)
		{
			root = new Node(ele , null , null , null);
		}
		else
		{
			Node current = root;
			Node parent = null;
			int cmp = 0;
			// �������ʵ�Ҷ�ӽڵ㣬�Ը�Ҷ�ӽڵ�Ϊ���ڵ�����½ڵ�
			do
			{
				parent = current;
				cmp = ele.compareTo(current.data);
				// ����½ڵ��ֵ���ڵ�ǰ�ڵ��ֵ
				if (cmp > 0)
				{
					// �����ӽڵ���Ϊ��ǰ�ڵ�
					current = current.right;
				}
				// ����½ڵ��ֵС�ڵ�ǰ�ڵ��ֵ
				else
				{
					// �����ӽڵ���Ϊ��ǰ�ڵ�
					current = current.left;
				}
			}
			while (current != null);
			// �����½ڵ�
			Node newNode = new Node(ele , parent , null , null);
			// ����½ڵ��ֵ���ڸ��ڵ��ֵ
			if (cmp > 0)
			{
				// �½ڵ���Ϊ���ڵ�����ӽڵ�
				parent.right = newNode;
			}
			// ����½ڵ��ֵС�ڸ��ڵ��ֵ
			else
			{
				// �½ڵ���Ϊ���ڵ�����ӽڵ�
				parent.left = newNode;
			}
		}
	}
	// ɾ���ڵ�
	public void remove(T ele)
	{
		// ��ȡҪɾ���Ľڵ�
		Node target = getNode(ele);
		// ���Ҫɾ���Ľڵ�Ϊnull��ֱ�ӷ���
		if (target == null)
		{
			return;
		}
		// ���Ҫɾ���Ľڵ����������Ϊ��
		if (target.left == null
			&& target.right == null)
		{
			// ���Ҫɾ���ڵ��Ǹ��ڵ�
			if (target == root)
			{
				root = null;
			}
			else
			{
				// Ҫɾ���ڵ��Ǹ��ڵ�����ӽڵ�
				if (target == target.parent.left)
				{
					// ��target�ĸ��ڵ��left��Ϊnull
					target.parent.left = null;
				}
				// Ҫɾ���ڵ��Ǹ��ڵ�����ӽڵ�
				else
				{
					// ��target�ĸ��ڵ��right��Ϊnull
					target.parent.right = null;
				}
				target.parent = null;
			}
		}
		// ���Ҫɾ���Ľڵ�ֻ��������
		else if (target.left == null
			&& target.right != null)
		{
			// ���Ҫɾ���ڵ��Ǹ��ڵ�
			if (target == root)
			{
				root = target.right;
			}
			else
			{
				// ���Ҫɾ���ڵ��Ǹ��ڵ�����ӽڵ�
				if (target == target.parent.left)
				{
					// ��target�ĸ��ڵ��leftָ��target��������
					target.parent.left = target.right;
				}
				// ���Ҫɾ���ڵ��Ǹ��ڵ�����ӽڵ�
				else
				{
					// ��target�ĸ��ڵ��rightָ��target��������
					target.parent.right = target.right;
				}
				//��target����������parentָ��target��parent
				target.right.parent = target.parent;
			}
		}
		// ���Ҫɾ���Ľڵ�ֻ��������
		else if(target.left != null
			&& target.right == null)
		{
			// ��ɾ���ڵ��Ǹ��ڵ�
			if (target == root)
			{
				root = target.left;
			}
			else
			{
				// ��ɾ���ڵ��Ǹ��ڵ�����ӽڵ�
				if (target == target.parent.left)
				{
					// ��target�ĸ��ڵ��leftָ��target��������
					target.parent.left = target.left;
				}
				else
				{
					// ��target�ĸ��ڵ��rightָ��target��������
					target.parent.right = target.left;
				}
				// ��target����������parentָ��target��parent
				target.left.parent = target.parent;
			}
		}
		// ���Ҫɾ���ڵ����������������������
		else
		{
			// leftMaxNode���ڱ���target�ڵ����������ֵ���Ľڵ�
			Node leftMaxNode = target.left;
			// ����target�ڵ����������ֵ���Ľڵ�
			while (leftMaxNode.right != null)
			{
				leftMaxNode = leftMaxNode.right;
			}
			// ��ԭ����������ɾ��leftMaxNode�ڵ�
			leftMaxNode.parent.right = null;
			// ��leftMaxNode��parentָ��target��parent
			leftMaxNode.parent = target.parent;
			// Ҫɾ���ڵ��Ǹ��ڵ�����ӽڵ�
			if (target == target.parent.left)
			{
				// ��target�ĸ��ڵ��leftָ��leftMaxNode
				target.parent.left = leftMaxNode;
			}
			// Ҫɾ���ڵ��Ǹ��ڵ�����ӽڵ�
			else
			{
				// ��target�ĸ��ڵ��rightָ��leftMaxNode
				target.parent.right = leftMaxNode;
			}
			leftMaxNode.left = target.left;
			leftMaxNode.right = target.right;
			target.parent = target.left = target.right = null;
		}
	}
	// ���ݸ�����ֵ�����ڵ�
	@SuppressWarnings("unchecked")
	public Node getNode(T ele)
	{
		//�Ӹ��ڵ㿪ʼ����
		Node p = root;
		while (p != null)
		{
			int cmp = ele.compareTo(p.data);
			// ���������ֵС�ڵ�ǰp�ڵ��ֵ
			if (cmp < 0)
			{
				// ������������
				p = p.left;
			}
			// ���������ֵ���ڵ�ǰp�ڵ��ֵ
			else if (cmp > 0)
			{
				// ������������
				p = p.right;
			}
			else
			{
				return p;
			}
		}
		return null;
	}
	// ������ȱ���
	public List<Node> breadthFirst()
	{
		Queue<Node> queue = new ArrayDeque<Node>();
		List<Node> list = new ArrayList<Node>();
		if( root != null)
		{
			// ����Ԫ�ؼ��롰���С�
			queue.offer(root);
		}
		while(!queue.isEmpty())
		{
			// ���ö��еġ���β����Ԫ����ӵ�List��
			list.add(queue.peek());
			Node p = queue.poll();
			// ������ӽڵ㲻Ϊnull���������롰���С�
			if(p.left != null)
			{
				queue.offer(p.left);
			}
			// ������ӽڵ㲻Ϊnull���������롰���С�
			if(p.right != null)
			{
				queue.offer(p.right);
			}
		}
		return list;
	}
}
