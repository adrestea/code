
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
public class BubbleSort
{
	public static void bubbleSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength = data.length;
		for (int i = 0; i < arrayLength - 1 ; i++ )
		{
			boolean flag = false;
			for (int j = 0; j < arrayLength - 1 - i ; j++ )
			{
				// 如果j索引处的元素大于j+1索引处的元素
				if (data[j].compareTo(data[j + 1]) > 0)
				{
					// 交换它们
					DataWrap tmp = data[j + 1];
					data[j + 1] = data[j];
					data[j] = tmp;
					flag = true;
				}
			}
			System.out.println(java.util.Arrays.toString(data));
			// 如果某趟没有发生交换，则表明已处于有序状态
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		bubbleSort(data);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}
