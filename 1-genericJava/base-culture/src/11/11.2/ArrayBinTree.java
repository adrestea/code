

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
public class ArrayBinTree<T>
{
	// ʹ����������¼���������нڵ�
	private Object[] datas;
	private int DEFAULT_DEEP = 8;
	// ������������
	private int deep;
	private int arraySize;
	// ��Ĭ�ϵ����������������
	public ArrayBinTree()
	{
		this.deep = DEFAULT_DEEP;
		this.arraySize = (int)Math.pow(2 , deep) - 1;
		datas = new Object[arraySize];
	}
	// ��ָ�����������������
	public ArrayBinTree(int deep)
	{
		this.deep = deep;
		this.arraySize = (int)Math.pow(2 , deep) - 1;
		datas = new Object[arraySize];
	}
	// ��ָ�����,ָ�����ڵ㴴��������
	public ArrayBinTree(int deep , T data)
	{
		this.deep = deep;
		this.arraySize = (int)Math.pow(2 , deep) - 1;
		datas = new Object[arraySize];
		datas[0] = data;
	}
	/**
	 * Ϊָ���ڵ�����ӽڵ㡣
	 * @param index ��Ҫ����ӽڵ�ĸ��ڵ������
	 * @param data ���ӽڵ������
	 * @param left �Ƿ�Ϊ��ڵ�
	 */
	public void add(int index , T data , boolean left)
	{
		if (datas[index] == null)
		{
			throw new RuntimeException(index + "���ڵ�Ϊ�գ��޷�����ӽڵ�");
		}
		if (2 * index + 1 >= arraySize)
		{
			throw new RuntimeException("���ײ��������������Խ���쳣");
		}
		// ������ӽڵ�
		if (left)
		{
			datas[2 * index + 1] = data;
		}
		else
		{
			datas[2 * index + 2] = data;
		}
	}
	// �ж϶������Ƿ�Ϊ�ա�
	public boolean empty()
	{
		// ���ݸ�Ԫ�����ж϶������Ƿ�Ϊ��
		return datas[0] == null;
	}
	// ���ظ��ڵ㡣
	@SuppressWarnings("unchecked")
	public T root()
	{
		return (T)datas[0] ;
	}
	// ����ָ���ڵ㣨�Ǹ��ڵ㣩�ĸ��ڵ㡣
	@SuppressWarnings("unchecked")
	public T parent(int index)
	{
		return (T)datas[(index - 1) / 2] ;
	}
	// ����ָ���ڵ㣨��Ҷ�ӣ������ӽڵ㡣
	// �����ӽڵ㲻����ʱ����null��
	@SuppressWarnings("unchecked")
	public T left(int index)
	{
		if (2 * index + 1 >= arraySize)
		{
			throw new RuntimeException("�ýڵ�ΪҶ�ӽڵ㣬���ӽڵ�");
		}
		return (T)datas[index * 2 + 1] ;
	}
	// ����ָ���ڵ㣨��Ҷ�ӣ������ӽڵ㡣
	// �����ӽڵ㲻����ʱ����null��
	@SuppressWarnings("unchecked")
	public T right(int index)
	{
		if (2 * index + 1 >= arraySize)
		{
			throw new RuntimeException("�ýڵ�ΪҶ�ӽڵ㣬���ӽڵ�");
		}
		return (T)datas[index * 2 + 2] ;
	}
	// ���ظö���������ȡ�
	public int deep(int index)
	{
		return deep;
	}
	// ����ָ���ڵ��λ�á�
	public int pos(T data)
	{
		// ��ѭ��ʵ���Ͼ��ǰ���ȱ���������ÿ���ڵ�
		for (int i = 0 ; i < arraySize ; i++)
		{
			if (datas[i].equals(data))
			{
				return i;
			}
		}
		return -1;
	}
	public String toString()
	{
		return java.util.Arrays.toString(datas);
	}
}