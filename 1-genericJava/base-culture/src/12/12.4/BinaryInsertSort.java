
import java.util.*;
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
public class BinaryInsertSort
{
	public static void binaryInsertSort(DataWrap[] data)
	{
		System.out.println("开始排序：\n");
		int arrayLength = data.length;
		for(int i = 1 ; i < arrayLength ; i++)
		{
			// 当整体后移时，保证data[i]的值不会丢失
			DataWrap tmp = data[i];
			int low = 0;
			int high = i - 1;
			while(low <= high)
			{
				// 找出low、high中间的索引
				int mid = (low + high) / 2;
				// 如果tmp值大于low、high中间元素的值
				if(tmp.compareTo(data[mid]) > 0)
				{
					// 限制在索引大于mid的那一半中搜索
					low = mid + 1;
				}
				else
				{
					// 限制在索引小于mid的那一半中搜索
					high = mid - 1;
				}
			}
			// 将low到i处的所有元素向后整体移一位
			for(int j = i ; j > low ; j--)
			{
				data[j] = data[j - 1];
			}
			// 最后将tmp的值插入合适位置
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		binaryInsertSort(data);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}
