
import java.util.Arrays;
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
public class SequenceList<T>
{
	private int DEFAULT_SIZE = 16;
	// ��������ĳ��ȡ�
	private int capacity;
	// ����һ���������ڱ���˳�����Ա��Ԫ��
	private Object[] elementData;
	// ����˳�����Ԫ�صĵ�ǰ����
	private int size = 0;
	// ��Ĭ�����鳤�ȴ�����˳�����Ա�
	public SequenceList()
	{
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}
	// ��һ����ʼ��Ԫ��������˳�����Ա�
	public SequenceList(T element)
	{
		this();
		elementData[0] = element;
		size++;
	}
	/**
	 * ��ָ�����ȵ�����������˳�����Ա�
	 * @param element ָ��˳�����Ա��е�һ��Ԫ��
	 * @param initSize ָ��˳�����Ա�ײ�����ĳ���
	 */
	public SequenceList(T element , int initSize)
	{
		capacity = 1;
		// ��capacity��Ϊ����initSize����С��2��n�η�
		while (capacity < initSize)
		{
			capacity <<= 1;
		}
		elementData = new Object[capacity];
		elementData[0] = element;
		size++;
	}
	// ��ȡ˳�����Ա�Ĵ�С
	public int length()
	{
		return size;
	}
	// ��ȡ˳�����Ա�������Ϊi����Ԫ��
	@SuppressWarnings("unchecked")
	public T get(int i)
	{
		if (i < 0 || i > size - 1)
		{
			throw new IndexOutOfBoundsException("���Ա�����Խ��");
		}
		return (T)elementData[i];
	}
	// ����˳�����Ա���ָ��Ԫ�ص�����
	public int locate(T element)
	{
		for (int i = 0 ; i < size ; i++)
		{
			if (elementData[i].equals(element))
			{
				return i;
			}
		}
		return -1;
	}
	// ��˳�����Ա��ָ��λ�ò���һ��Ԫ�ء�
	public void insert(T element , int index)
	{
		if (index < 0 || index > size)
		{
			throw new IndexOutOfBoundsException("���Ա�����Խ��");
		}
		ensureCapacity(size + 1);
		// ��index���Ժ�����Ԫ������ƶ�һ��
		System.arraycopy(elementData , index , elementData
			 , index + 1 , size - index);
		elementData[index] = element;
		size++;
	}
	// ������˳���Ŀ�ʼ�����һ��Ԫ�ء�
	public void add(T element)
	{
		insert(element , size);
	}
	// ����ײ����鳤�ȣ����鷳���������ܺܲ�
	private void ensureCapacity(int minCapacity)
	{
		// ��������ԭ�г���С��Ŀǰ����ĳ���
		if (minCapacity > capacity)
		{
			// ���ϵؽ�capacity * 2��ֱ��capacity����minCapacityΪֹ
			while (capacity < minCapacity)
			{
				capacity <<= 1;
			}
			elementData = Arrays.copyOf(elementData , capacity);
		}
	}
	// ɾ��˳�����Ա���ָ����������Ԫ��
	@SuppressWarnings("unchecked")
	public T delete(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("���Ա�����Խ��");
		}
		T oldValue = (T)elementData[index];
		int numMoved = size - index - 1;
		if (numMoved > 0)
		{
			System.arraycopy(elementData , index+1
				, elementData, index , 	numMoved);
		}
		// ������һ��Ԫ��
		elementData[--size] = null;
		return oldValue;
	}
	// ɾ��˳�����Ա������һ��Ԫ��
	public T remove()
	{
		return delete(size - 1);
	}
	// �ж�˳�����Ա��Ƿ�Ϊ�ձ�
	public boolean empty()
	{
		return size == 0;
	}
	// ������Ա�
	public void clear()
	{
		// ���ײ���������Ԫ�ظ�Ϊnull
		Arrays.fill(elementData , null);
		size = 0;
	}
	public String toString()
	{
		if (size == 0)
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for (int i = 0 ; i < size ; i++ )
			{
				sb.append(elementData[i].toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2 , len).append("]").toString();
		}
	}
}
