
import java.util.Arrays;
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
	// 根据data实例变量来决定两个DataWrap的大小
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
		System.out.println("开始排序：");
		// arrayLength记录待排序数组的长度
		int arrayLength = data.length;
		DataWrap[] tmp = new DataWrap[arrayLength];
		// buckets数组相当于定义了max - min个桶，
		// buckets数组用于记录待排序元素的信息
		int[] buckets = new int[max - min];
		// 计算每个元素在序列出现的次数
		for(int i = 0 ; i < arrayLength ; i++)
		{
			//buckets数组记录了DataWrap出现的次数
			buckets[data[i].data - min]++;
		}
		System.out.println( Arrays.toString(buckets));
		// 计算“落入”各桶内的元素在有序序列中的位置
		for(int i = 1 ; i < max - min; i++)
		{
			// 前一个bucket的值 + 当前bucket的值 -> 当前bucket新的值
			buckets[i] = buckets[i] + buckets[i - 1];
		}
		// 循环结束后，buckets数组元素记录了“落入”前面所有桶和
		// “落入”当前buckets中元素的总数，
		// 也就说：buckets数组元素的值代表了“落入”当前桶的元素在有序序列中的位置
		System.out.println( Arrays.toString(buckets));
		// 将data数组中数据完全复制到tmp数组中缓存起来。
		System.arraycopy(data, 0, tmp, 0, arrayLength);
		// 根据buckets数组中的信息将待排序列的各元素放入相应的位置。
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		bucketSort(data , -3 , 10);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}