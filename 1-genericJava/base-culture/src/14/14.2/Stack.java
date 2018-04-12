

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Stack<T>
{
	// 存放栈内元素的数组
	private T[] elementData;
	// 记录栈内元素的个数
	private int size = 0;
	private int capacityIncrement;
	// 以指定初始化容量创建一个Stack
	public Stack(int initialCapacity)
	{
		elementData = new T[initialCapacity];
	}
	public Stack(int initialCapacity , int capacityIncrement)
	{
		this(initialCapacity);
		this.capacityIncrement = capacityIncrment;
	}
	// 向“栈”顶压入一个元素
	public void push(T object)
	{
		ensureCapacity();
		elementData[size++] = object;
	}
	public T pop()
	{
		if(size == 0)
		{
			throw new RuntimeException("空栈异常");
		}
		return elementData[--size];
	}
	public int size()
	{
		return size;
	}
	// 保证底层数组能容纳栈内所有元素
	private void ensureCapacity()
	{
		// 增加堆栈的容量
		if(elementData.length==size)
		{
			Object[] oldElements = elementData;
			int newLength = 0;
			// 已经设置capacityIncrement
			if (capacityIncrement > 0)
			{
				newLength = elementData.length
					+ capacityIncrement;
			}
			else
			{
				// 将长度扩充到原来的1.5倍
				newLength = elementData.length * 1.5;
			}
			elementData = new T[newLength];
			// 将原数组的元素复制到新数组中
			System.arraycopy(oldElements , 0
				, elementData , 0 , size);
		}
	}
}