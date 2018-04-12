
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
public class SequenceQueue<T>
{
	private int DEFAULT_SIZE = 10;
	// ��������ĳ��ȡ�
	private int capacity;
	// ����һ���������ڱ���˳����е�Ԫ��
	private Object[] elementData;
	// ����˳�������Ԫ�صĵ�ǰ����
	private int front = 0;
	private int rear = 0;
	// ��Ĭ�����鳤�ȴ�����˳�����
	public SequenceQueue()
	{
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}
	// ��һ����ʼ��Ԫ��������˳�����
	public SequenceQueue(T element)
	{
		this();
		elementData[0] = element;
		rear++;
	}
	/**
	 * ��ָ�����ȵ�����������˳�����
	 * @param element ָ��˳������е�һ��Ԫ��
	 * @param initSize ָ��˳����еײ�����ĳ���
	 */
	public SequenceQueue(T element , int initSize)
	{
		this.capacity = initSize;
		elementData = new Object[capacity];
		elementData[0] = element;
		rear++;
	}
	// ��ȡ˳����еĴ�С
	public int length()
	{
		return rear - front;
	}
	// �������
	public void add(T element)
	{
		if (rear > capacity - 1)
		{
			throw new IndexOutOfBoundsException("�����������쳣");
		}
		elementData[rear++] = element;
	}
	// �Ƴ�����
	@SuppressWarnings("unchecked")
	public T remove()
	{
		if (empty())
		{
			throw new IndexOutOfBoundsException("�ն����쳣");
		}
		// �������е�front�˵�Ԫ�ص�ֵ
		T oldValue = (T)elementData[front];
		// �ͷŶ��е�front�˵�Ԫ��
		elementData[front++] = null;
		return oldValue;
	}
	// ���ض��ж�Ԫ�أ�����ɾ�����ж�Ԫ��
	@SuppressWarnings("unchecked")
	public T element()
	{
		if (empty())
		{
			throw new IndexOutOfBoundsException("�ն����쳣");
		}
		return (T)elementData[front];
	}
	// �ж�˳������Ƿ�Ϊ�ն���
	public boolean empty()
	{
		return rear == front;
	}
	// ���˳�����
	public void clear()
	{
		//���ײ���������Ԫ�ظ�Ϊnull
		Arrays.fill(elementData , null);
		front = 0;
		rear = 0;
	}
	public String toString()
	{
		if (empty())
		{
			return "[]";
		}
		else
		{
			StringBuilder sb = new StringBuilder("[");
			for (int i = front  ; i < rear ; i++ )
			{
				sb.append(elementData[i].toString() + ", ");
			}
			int len = sb.length();
			return sb.delete(len - 2 , len).append("]").toString();
		}
	}
}
