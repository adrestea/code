
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
public class ShellSort
{
	public static void shellSort(DataWrap[] data)
	{
		System.out.println("��ʼ����");
		int arrayLength = data.length;
		// h��������ɱ�����
		int h = 1;
		// ��h * 3 + 1�õ��������е����ֵ
		while(h <= arrayLength / 3)
		{
			h = h * 3 + 1;
		}
		while(h > 0)
		{
			System.out.println("===h��ֵ:" + h + "===");
			for (int i = h ; i < arrayLength ; i++ )
			{
				// ���������ʱ����֤data[i]��ֵ���ᶪʧ
				DataWrap tmp = data[i];
				// i��������ֵ�Ѿ���ǰ������ֵ���󣬱����Ѿ������������
				// ��i-1����֮ǰ�������Ѿ�����ģ�i-1������Ԫ�ص�ֵ�������ֵ��
				if (data[i].compareTo(data[i - h]) < 0)
				{
					int j = i - h;
					// �������h��
					for ( ; j >= 0 && data[j].compareTo(tmp) > 0 ; j-=h)
					{
						data[j + h] = data[j];
					}
					// ���tmp��ֵ�������λ��
					data[j + h] = tmp;
				}
				System.out.println(java.util.Arrays.toString(data));
			}
			h = (h - 1) / 3;
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
			new DataWrap(30 , ""),
		};
		System.out.println("����֮ǰ��\n"
			+ java.util.Arrays.toString(data));
		shellSort(data);
		System.out.println("����֮��\n"
			+ java.util.Arrays.toString(data));
	}
}
