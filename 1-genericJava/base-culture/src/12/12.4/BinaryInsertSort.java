
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
public class BinaryInsertSort
{
	public static void binaryInsertSort(DataWrap[] data)
	{
		System.out.println("��ʼ����\n");
		int arrayLength = data.length;
		for(int i = 1 ; i < arrayLength ; i++)
		{
			// ���������ʱ����֤data[i]��ֵ���ᶪʧ
			DataWrap tmp = data[i];
			int low = 0;
			int high = i - 1;
			while(low <= high)
			{
				// �ҳ�low��high�м������
				int mid = (low + high) / 2;
				// ���tmpֵ����low��high�м�Ԫ�ص�ֵ
				if(tmp.compareTo(data[mid]) > 0)
				{
					// ��������������mid����һ��������
					low = mid + 1;
				}
				else
				{
					// ����������С��mid����һ��������
					high = mid - 1;
				}
			}
			// ��low��i��������Ԫ�����������һλ
			for(int j = i ; j > low ; j--)
			{
				data[j] = data[j - 1];
			}
			// ���tmp��ֵ�������λ��
			data[low] = tmp;
			System.out.println(java.util.Arrays.toString(data));
		}
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
			new DataWrap(9 , ""),
			new DataWrap(-16 , ""),
			new DataWrap(21 , "*"),
			new DataWrap(23 , ""),
			new DataWrap(-30 , ""),
			new DataWrap(-49 , ""),
			new DataWrap(21 , ""),
			new DataWrap(30 , "*"),
			new DataWrap(30 , "")
		};
		System.out.println("����֮ǰ��\n"
			+ java.util.Arrays.toString(data));
		binaryInsertSort(data);
		System.out.println("����֮��\n"
			+ java.util.Arrays.toString(data));
	}
}
