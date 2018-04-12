
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
	public int compareTo(DataWrap dw)
	{
		return this.data > dw.data ? 1
			: (this.data == dw.data ? 0 : -1);
	}
}
public class SelectSort2
{
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		// ���ν���n-1�˱Ƚ�, ��i�˱ȽϽ���i���ֵѡ������iλ���ϡ�
		for (int i = 0; i < arrayLength - 1 ; i++ )
		{
			// minIndex��Զ�������˱Ƚ�����Сֵ������
			int minIndex = i ;
			// ��i������ֻ�������������ݱȽ�
			for (int j = i + 1 ; j < arrayLength ; j++ )
			{
				// �����minIndexλ�õ����� > jλ�õ�����
				if (data[minIndex].compareTo(data[j]) > 0)
				{
					// ��j��ֵ����minIndex
					minIndex = j;
				}
			}
			// ÿ�˱Ƚ���ཻ��һ��
			if (minIndex != i)
			{
				DataWrap tmp = data[i];
				data[i] = data[minIndex];
				data[minIndex] = tmp;
			}
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
			new DataWrap(21 , ""),
			new DataWrap(30 , ""),
			new DataWrap(49 , ""),
			new DataWrap(30 , "*"),
			new DataWrap(16 , ""),
			new DataWrap(9 , "")
		};
		System.out.println("����֮ǰ��\n"
			+ java.util.Arrays.toString(data));
		selectSort(data);
		System.out.println("����֮��\n"
			+ java.util.Arrays.toString(data));
	}
}