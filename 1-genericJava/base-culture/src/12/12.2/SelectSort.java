
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
public class SelectSort
{
	public static void selectSort(DataWrap[] data)
	{
		System.out.println("开始排序");
		int arrayLength = data.length;
		// 依次进行n-1趟比较, 第i趟比较将第i大的值选出放在i位置上。
		for (int i = 0; i < arrayLength - 1 ; i++ )
		{
			// 第i个数据只需和它后面的数据比较
			for (int j = i + 1 ; j < arrayLength ; j++ )
			{
				// 如果第i位置的数据 > j位置的数据, 交换它们
				if (data[i].compareTo(data[j]) > 0)
				{
					DataWrap tmp = data[i];
					data[i] = data[j];
					data[j] = tmp;
				}
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		selectSort(data);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}
