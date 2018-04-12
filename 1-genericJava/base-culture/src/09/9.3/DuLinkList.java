

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
public class DuLinkList<T>
{
	// ����һ���ڲ���Node��Nodeʵ����������Ľڵ㡣
	private class Node
	{
		// ����ڵ������
		private T data;
		// ָ���ϸ��ڵ������
		private Node prev;
		// ָ���¸��ڵ������
		private Node next;
		// �޲����Ĺ�����
		public Node()
		{
		}
		// ��ʼ��ȫ�����ԵĹ�����
		public Node(T data , Node prev , Node next)
		{
			this.data = data;
			this.prev = prev;
			this.next = next;
		}
	}
	// ����������ͷ�ڵ�
	private Node header;
	// ����������β�ڵ�
	private Node tail;
	// ������������Ѱ����Ľڵ���
	private int size;
	// ����������
	public DuLinkList()
	{
		// ������header��tail����null
		header = null;
		tail = null;
	}
	// ��ָ������Ԫ������������������ֻ��һ��Ԫ��
	public DuLinkList(T element)
	{
		header = new Node(element , null , null);
		// ֻ��һ���ڵ㣬header��tail��ָ��ýڵ�
		tail = header;
		size++;
	}
	// ��������ĳ���
	public int length()
	{
		return size;
	}

	// ��ȡ��ʽ���Ա�������Ϊindex����Ԫ��
	public T get(int index)
	{
		return getNodeByIndex(index).data;
	}
	// ��������index��ȡָ��λ�õĽڵ�
	private Node getNodeByIndex(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("���Ա�����Խ��");
		}
		if (index <= size / 2)
		{
			// ��header�ڵ㿪ʼ
			Node current = header;
			for (int i = 0 ; i <= size / 2 && current != null
				; i++ , current = current.next)
			{
				if (i == index)
				{
					return current;
				}
			}
		}
		else
		{
			// ��tail�ڵ㿪ʼ����
			Node current = tail;
			for (int i = size - 1 ; i > size / 2 && current != null
				; i++ , current = current.prev)
			{
				if (i == index)
				{
					return current;
				}
			}
		}
		return null;
	}
	// ������ʽ���Ա���ָ��Ԫ�ص�����
	public int locate(T element)
	{
		// ��ͷ�ڵ㿪ʼ����
		Node current = header;
		for (int i = 0 ; i < size && current != null
			; i++ , current = current.next)
		{
			if (current.data.equals(element))
			{
				return i;
			}
		}
		return -1;
	}
	// ��������ʽ���ָ��λ�ò���һ��Ԫ�ء�
	public void insert(T element , int index)
	{
		if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("���Ա�����Խ��");
		}
		// ������ǿ�����
		if (header == null)
		{
			add(element);
		}
		else
		{
			// ��indexΪ0ʱ��Ҳ����������ͷ������
			if (index == 0)
			{
				addAtHeader(element);
			}
			else
			{
				// ��ȡ������ǰһ���ڵ�
				Node prev = getNodeByIndex(index - 1);
				// ��ȡ�����Ľڵ�
				Node next = prev.next;
				// ���½ڵ��next����ָ��next�ڵ㣬prev����ָ��prev�ڵ�
				Node newNode = new Node(element , prev , next);
				// ��prev��nextָ���½ڵ㡣
				prev.next = newNode;
				// ��prev����һ���ڵ��prevָ���½ڵ�
				next.prev = newNode;
				size++;
			}
		}
	}
	// ����β�巨Ϊ��������½ڵ㡣
	public void add(T element)
	{
		// ����������ǿ�����
		if (header == null)
		{
			header = new Node(element , null , null);
			// ֻ��һ���ڵ㣬header��tail��ָ��ýڵ�
			tail = header;
		}
		else
		{
			// �����½ڵ�,�½ڵ��pre����ָ��ԭtail�ڵ�
			Node newNode = new Node(element , tail , null);
			// ��β�ڵ��nextָ�������Ľڵ�
			tail.next = newNode;
			// ���½ڵ���Ϊ�µ�β�ڵ�
			tail = newNode;
		}
		size++;
	}
	// ����ͷ�巨Ϊ��������½ڵ㡣
	public void addAtHeader(T element)
	{
		// �����½ڵ㣬���½ڵ��nextָ��ԭ����header
		// �����½ڵ���Ϊ�µ�header
		header = new Node(element , null , header);
		// �������֮ǰ�ǿ�����
		if (tail == null)
		{
			tail = header;
		}
		size++;
	}
	// ɾ����ʽ���Ա���ָ����������Ԫ��
	public T delete(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("���Ա�����Խ��");
		}
		Node del = null;
		// �����ɾ������header�ڵ�
		if (index == 0)
		{
			del = header;
			header = header.next;
			// �ͷ��µ�header�ڵ��prev����
			header.prev = null;
		}
		else
		{
			// ��ȡɾ�����ǰһ���ڵ�
			Node prev = getNodeByIndex(index - 1);
			// ��ȡ��Ҫ��ɾ���Ľڵ�
			del = prev.next;
			// �ñ�ɾ���ڵ��nextָ��ɾ���ڵ����һ���ڵ㡣
			prev.next = del.next;
			// �ñ�ɾ���ڵ����һ���ڵ��prevָ��prev�ڵ㡣
			if (del.next != null)
			{
				del.next.prev = prev;
			}
			// ����ɾ���ڵ��prev��next���ø�Ϊnull.
			del.prev = null;
			del.next = null;
		}
		size--;
		return del.data;
	}
	// ɾ����ʽ���Ա������һ��Ԫ��
	public T remove()
	{
		return delete(size - 1);
	}
	// �ж���ʽ���Ա��Ƿ�Ϊ������
	public boolean empty()
	{
		return size == 0;
	}
	// ������Ա�
	public void clear()
	{
		// ���ײ���������Ԫ�ظ�Ϊnull
		header = null;
		tail = null;
		size = 0;
	}
	public String toString()
	{
		// ����Ϊ������ʱ
		if (empty())
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for (Node current = header ; current != null
				; current = current.next )
			{
				sb.append(current.data.toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2 , len).append("]").toString();
		}
	}
	public String reverseToString()
	{
		// ����Ϊ������ʱ
		if (empty())
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for (Node current = tail ; current != null
				; current = current.prev )
			{
				sb.append(current.data.toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2 , len).append("]").toString();
		}
	}
}