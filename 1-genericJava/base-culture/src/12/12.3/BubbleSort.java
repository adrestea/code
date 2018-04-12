
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
// ����һ�����ݰ�װ��
class DataWrap implements Comparable<DataWrap>
{
	int data;
	String flag;
	public DataWrap(int data, String flag)
	{
		this.data = data;
		this.flag = flag;
	}
	public String toString()
	{
		return data + flag;
	}
	// ����dataʵ����������������DataWrap�Ĵ�С
	public int compareTo(DataWrap dw)
	{
		return this.data > dw.data ? 1
			: (this.data == dw.data ? 0 : -1);
	}
}
public class BubbleSort
{
	public static void bubbleSort(DataWrap[] data)
	{
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		for (int i = 0; i < arrayLength - 1 ; i++ )
		{
			boolean flag = false;
			for (int j = 0; j < arrayLength - 1 - i ; j++ )
			{
				// ���j��������Ԫ�ش���j+1��������Ԫ��
				if (data[j].compareTo(data[j + 1]) > 0)
				{
					// ��������
					DataWrap tmp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = tmp;
					flag = true;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
			// ���ĳ��û�з���������������Ѵ�������״̬
			if (!flag)
			{
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
			new DataWrap(9 , ""),
			new DataWrap(16 , ""),
			new DataWrap(21 , "*"),
			new DataWrap(23 , ""),
			new DataWrap(30 , ""),
			new DataWrap(49 , ""),
			new DataWrap(21 , ""),
			new DataWrap(30 , "*")
		};
		System.out.println("����֮ǰ��\n"
			+ java.util.Arrays.toString(data));
		bubbleSort(data);
		System.out.println("����֮��\n"
			+ java.util.Arrays.toString(data));
	}
}
