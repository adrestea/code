
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
public class LoopQueue<T>
{
	private int DEFAULT_SIZE = 10;
	// ��������ĳ��ȡ�
	private int capacity;
	// ����һ���������ڱ���ѭ�����е�Ԫ��
	private Object[] elementData;
	// ����ѭ��������Ԫ�صĵ�ǰ����
	private int front = 0;
	private int rear = 0;
	// ��Ĭ�����鳤�ȴ�����ѭ������
	public LoopQueue()
	{
		capacity = DEFAULT_SIZE;
		elementData = new Object[capacity];
	}
	// ��һ����ʼ��Ԫ��������ѭ������
	public LoopQueue(T element)
	{
		this();
		elementData[0] = element;
		rear++;
	}
	/**
	 * ��ָ�����ȵ�����������ѭ������
	 * @param element ָ��ѭ�������е�һ��Ԫ��
	 * @param initSize ָ��ѭ�����еײ�����ĳ���
	 */
	public LoopQueue(T element , int initSize)
	{
		this.capacity = initSize;
		elementData = new Object[capacity];
		elementData[0] = element;
		rear++;
	}
	// ��ȡѭ�����еĴ�С
	public int length()
	{
		if (empty())
		{
			return 0;
		}
		return rear > front ? rear - front
			: capacity - (front - rear);
	}
	// �������
	public void add(T element)
	{
		if (rear == front
			&& elementData[front] != null)
		{
			throw new IndexOutOfBoundsException("�����������쳣");
		}
		elementData[rear++] = element;
		// ���rear�Ѿ���ͷ���Ǿ�תͷ
		rear = rear == capacity ? 0 : rear;
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
		// ���front�Ѿ���ͷ���Ǿ�תͷ
		front = front == capacity ? 0 : front;
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
	// �ж�ѭ�������Ƿ�Ϊ�ն���
	public boolean empty()
	{
		//rear==front��rear����Ԫ��Ϊnull
		return rear == front
			&& elementData[rear] == null;
	}
	// ���ѭ������
	public void clear()
	{
		// ���ײ���������Ԫ�ظ�Ϊnull
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
			// ���front < rear����ЧԪ�ؾ���front��rear֮���Ԫ��
			if (front < rear)
			{
				StringBuilder sb = new StringBuilder("[");
				for (int i = front  ; i < rear ; i++ )
				{
					sb.append(elementData[i].toString() + ", ");
				}
				int len = sb.length();
				return sb.delete(len - 2 , len).append("]").toString();
			}
			// ���front >= rear����ЧԪ��Ϊfront->capacity֮�䡢
			// ��0->front֮���Ԫ��
			else
			{
				StringBuilder sb = new StringBuilder("[");
				for (int i = front  ; i < capacity ; i++ )
				{
					sb.append(elementData[i].toString() + ", ");
				}
				for (int i = 0 ; i < rear ; i++)
				{
					sb.append(elementData[i].toString() + ", ");
				}
				int len = sb.length();
				return sb.delete(len - 2 , len).append("]").toString();
			}
		}
	}
}
