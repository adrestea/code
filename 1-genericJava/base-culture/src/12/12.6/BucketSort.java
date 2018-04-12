
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
public class BucketSort
{
	public static void bucketSort(DataWrap[] data
		, int min , int max)
	{
		System.out.println("��ʼ����");
		// arrayLength��¼����������ĳ���
		int arrayLength = data.length;
		DataWrap[] tmp = new DataWrap[arrayLength];
		// buckets�����൱�ڶ�����max - min��Ͱ��
		// buckets�������ڼ�¼������Ԫ�ص���Ϣ
		int[] buckets = new int[max - min];
		// ����ÿ��Ԫ�������г��ֵĴ���
		for(int i = 0 ; i < arrayLength ; i++)
		{
			//buckets�����¼��DataWrap���ֵĴ���
			buckets[data[i].data - min]++;
		}
		System.out.println( Arrays.toString(buckets));
		// ���㡰���롱��Ͱ�ڵ�Ԫ�������������е�λ��
		for(int i = 1 ; i < max - min; i++)
		{
			// ǰһ��bucket��ֵ + ��ǰbucket��ֵ -> ��ǰbucket�µ�ֵ
			buckets[i] = buckets[i] + buckets[i - 1];
		}
		// ѭ��������buckets����Ԫ�ؼ�¼�ˡ����롱ǰ������Ͱ��
		// �����롱��ǰbuckets��Ԫ�ص�������
		// Ҳ��˵��buckets����Ԫ�ص�ֵ�����ˡ����롱��ǰͰ��Ԫ�������������е�λ��
		System.out.println( Arrays.toString(buckets));
		// ��data������������ȫ���Ƶ�tmp�����л���������
		System.arraycopy(data, 0, tmp, 0, arrayLength);
		// ����buckets�����е���Ϣ���������еĸ�Ԫ�ط�����Ӧ��λ�á�
		for(int k = arrayLength - 1 ; k >=  0 ; k--)
		{
			data[--buckets[tmp[k].data - min]] = tmp[k];
		}
	}
	public static void main(String[] args)
	{
		DataWrap[] data = {
			new DataWrap(9 , ""),
			new DataWrap(5, ""),
			new DataWrap(-1, ""),
			new DataWrap(8 , ""),
			new DataWrap(5 , "*"),
			new DataWrap(7 , ""),
			new DataWrap(3 , ""),
			new DataWrap(-3, ""),
			new DataWrap(1 , ""),
			new DataWrap(3 , "*")
		};
		System.out.println("����֮ǰ��\n"
			+ java.util.Arrays.toString(data));
		bucketSort(data , -3 , 10);
		System.out.println("����֮��\n"
			+ java.util.Arrays.toString(data));
	}
}