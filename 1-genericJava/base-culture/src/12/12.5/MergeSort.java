

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
// 定义一个数据包装类
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
public class MergeSort
{
	// 利用归并排序算法对数组data进行排序
	public static void mergeSort(DataWrap[] data)
	{
		// 归并排序
		sort(data , 0 , data.length - 1);
	}
	/**
	 * 将索引从left到right范围的数组元素进行归并排序
	 * @param data 待排序的数组
	 * @param left 待排序的数组的第一个元素索引
	 * @param right 待排序的数组的最后一个元素的索引
	 */
	private static void sort(DataWrap[] data
		 , int left, int right)
	{
		if (left < right)
		{
			// 找出中间索引
			int center = (left + right) / 2;
			// 对左边数组进行递归
			sort(data, left, center);
			// 对右边数组进行递归
			sort(data, center + 1, right);
			// 合并
			merge(data, left, center, right);
		}
	}
	/**
	 * 将两个数组进行归并，归并前两个数组已经有序，归并后依然有序。
	 * @param data 数组对象
	 * @param left 左数组的第一个元素的索引
	 * @param center 左数组的最后一个元素的索引，center+1是右数组第一个元素的索引
	 * @param right 右数组的最后一个元素的索引
	 */
	private static void merge(DataWrap[] data
		, int left, int center, int right)
	{
		// 定义一个与待排序序列长度相同的临时数组
		DataWrap[] tmpArr = new DataWrap[data.length];
		int mid = center + 1;
		// third记录中间数组的索引
		int third = left;
		int tmp = left;
		while (left <= center && mid <= right)
		{
			// 从两个数组中取出小的放入中间数组
			if (data[left].compareTo(data[mid]) <= 0)
			{
				tmpArr[third++] = data[left++];
			}
			else
			{
				tmpArr[third++] = data[mid++];
			}
		}
		// 剩余部分依次放入中间数组
		while (mid <= right)
		{
			tmpArr[third++] = data[mid++];
		}
		while (left <= center)
		{
			tmpArr[third++] = data[left++];
		}
		// 将中间数组中的内容复制拷回原数组
		// (原left～right范围的内容复制回原数组)
		while (tmp <= right)
		{
			data[tmp] = tmpArr[tmp++];
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		mergeSort(data);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}
