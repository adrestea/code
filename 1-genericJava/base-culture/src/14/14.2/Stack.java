

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
public class Stack<T>
{
	// ���ջ��Ԫ�ص�����
	private T[] elementData;
	// ��¼ջ��Ԫ�صĸ���
	private int size = 0;
	private int capacityIncrement;
	// ��ָ����ʼ����������һ��Stack
	public Stack(int initialCapacity)
	{
		elementData = new T[initialCapacity];
	}
	public Stack(int initialCapacity , int capacityIncrement)
	{
		this(initialCapacity);
		this.capacityIncrement = capacityIncrment;
	}
	// ��ջ����ѹ��һ��Ԫ��
	public void push(T object)
	{
		ensureCapacity();
		elementData[size++] = object;
	}
	public T pop()
	{
		if(size == 0)
		{
			throw new RuntimeException("��ջ�쳣");
		}
		return elementData[--size];
	}
	public int size()
	{
		return size;
	}
	// ��֤�ײ�����������ջ������Ԫ��
	private void ensureCapacity()
	{
		// ���Ӷ�ջ������
		if(elementData.length==size)
		{
			Object[] oldElements = elementData;
			int newLength = 0;
			// �Ѿ�����capacityIncrement
			if (capacityIncrement > 0)
			{
				newLength = elementData.length
					+ capacityIncrement;
			}
			else
			{
				// ���������䵽ԭ����1.5��
				newLength = elementData.length * 1.5;
			}
			elementData = new T[newLength];
			// ��ԭ�����Ԫ�ظ��Ƶ���������
			System.arraycopy(oldElements , 0
				, elementData , 0 , size);
		}
	}
}