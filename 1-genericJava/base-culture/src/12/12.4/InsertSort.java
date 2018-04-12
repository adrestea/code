
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
	//����dataʵ����������������DataWrap�Ĵ�С
	public int compareTo(DataWrap dw)
	{
		return this.data > dw.data ? 1
			: (this.data == dw.data ? 0 : -1);
	}
}
public class InsertSort
{
	public static void insertSort(DataWrap[] data)
	{
		System.out.println("��ʼ����\n");
		int arrayLength = data.length;
		for (int i = 1 ; i < arrayLength ; i++ )
		{
			// ���������ʱ����֤data[i]��ֵ���ᶪʧ
			DataWrap tmp = data[i];
			// i��������ֵ�Ѿ���ǰ������ֵ���󣬱����Ѿ������������
			//��i-1����֮ǰ�������Ѿ�����ģ�i-1������Ԫ�ص�ֵ�������ֵ��
			if (data[i].compareTo(data[i - 1]) < 0)
			{
				int j = i - 1;
				//�������һ��
				for ( ; j >= 0 && data[j].compareTo(tmp) > 0 ; j--)
				{
					data[j + 1] = data[j];
				}
				// ���tmp��ֵ�������λ��
				data[j + 1] = tmp;
			}
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
		insertSort(data);
		System.out.println("����֮��\n"
			+ java.util.Arrays.toString(data));
	}
}
