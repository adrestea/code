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
public class HuffmanTree
{
	public static class Node<E>
	{
		E data;
		double weight;
		Node<E> leftChild;
		Node<E> rightChild;
		public Node(E data , double weight)
		{
			this.data = data;
			this.weight = weight;
		}
		public String toString()
		{
			return "Node[data=" + data
				+ ", weight=" + weight + "]";
		}
	}
	public static void main(String[] args)
	{
		List<Node<String>> nodes = new ArrayList<>();
		nodes.add(new Node<String>("A" , 40.0));
		nodes.add(new Node<String>("B" , 7.0));
		nodes.add(new Node<String>("C" , 10.0));
		nodes.add(new Node<String>("D" , 30.0));
		nodes.add(new Node<String>("E" , 12.0));
		nodes.add(new Node<String>("F" , 2.0));
		Node<String> root = HuffmanTree.createTree(nodes);
		System.out.println(breadthFirst(root));
	}
	/**
	 * �����������
	 * @param nodes �ڵ㼯��
	 * @return ��������Ĺ��������ĸ��ڵ�
	 */
	private static <E> Node<E> createTree(List<Node<E>> nodes)
	{
		// ֻҪnodes�����л���2�����ϵĽڵ�
		while (nodes.size() > 1)
		{
			quickSort(nodes);
			// ��ȡȨֵ��С�������ڵ�
			Node<E> left = nodes.get(nodes.size() - 1);
			Node<E> right = nodes.get(nodes.size() - 2);
			// �����½ڵ㣬�½ڵ��ȨֵΪ�����ӽڵ��Ȩֵ֮��
			Node<E> parent = new Node<>(null , left.weight + right.weight);
			// ���½ڵ���ΪȨֵ��С�������ڵ�ĸ��ڵ�
			parent.leftChild = left;
			parent.rightChild = right;
			// ɾ��Ȩֵ��С�������ڵ�
			nodes.remove(nodes.size() - 1);
			nodes.remove(nodes.size() - 1);
			// �������ɵĸ��ڵ���ӵ�������
			nodes.add(parent);
		}
		// ����nodes������Ψһ�Ľڵ㣬Ҳ���Ǹ��ڵ�
		return nodes.get(0);
	}
	// ��ָ�������i��j��������Ԫ�ؽ���
	private static <E> void swap(List<Node<E>> nodes, int i, int j)
	{
		Node<E> tmp;
		tmp = nodes.get(i);
		nodes.set(i , nodes.get(j));
		nodes.set(j , tmp);
	}
	// ʵ�ֿ��������㷨�����ڶԽڵ��������
	private static <E> void subSort(List<Node<E>> nodes
		, int start , int end)
	{
		// ��Ҫ����
		if (start < end)
		{
			// �Ե�һ��Ԫ����Ϊ�ֽ�ֵ
			Node base = nodes.get(start);
			// i������������������ڷֽ�ֵ��Ԫ�ص�����
			int i = start;
			// j���ұ߿�ʼ����������С�ڷֽ�ֵ��Ԫ�ص�����
			int j = end + 1;
			while(true)
			{
				// �ҵ����ڷֽ�ֵ��Ԫ�ص���������i�Ѿ�����end��
				while(i < end && nodes.get(++i).weight >= base.weight);
				// �ҵ�С�ڷֽ�ֵ��Ԫ�ص���������j�Ѿ�����start��
				while(j > start && nodes.get(--j).weight <= base.weight);
				if (i < j)
				{
					swap(nodes , i , j);
				}
				else
				{
					break;
				}
			}
			swap(nodes , start , j);
			// �ݹ���������
			subSort(nodes , start , j - 1);
			// �ݹ��ұ�������
			subSort(nodes , j + 1, end);
		}
	}
	public static <E> void quickSort(List<Node<E>> nodes)
	{
		subSort(nodes , 0 , nodes.size() - 1);
	}
	// ������ȱ���
	public static List<Node> breadthFirst(Node root)
	{
		Queue<Node> queue = new ArrayDeque<Node>();
		List<Node> list = new ArrayList<Node>();
		if( root != null)
		{
			// ����Ԫ���롰���С�
			queue.offer(root);
		}
		while(!queue.isEmpty())
		{
			// ���ö��еġ���β����Ԫ����ӵ�List��
			list.add(queue.peek());
			Node p = queue.poll();
			// ������ӽڵ㲻Ϊnull���������롰���С�
			if(p.leftChild != null)
			{
				queue.offer(p.leftChild);
			}
			// ������ӽڵ㲻Ϊnull���������롰���С�
			if(p.rightChild != null)
			{
				queue.offer(p.rightChild);
			}
		}
		return list;
	}
}