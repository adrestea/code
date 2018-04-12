
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
	//根据data实例变量来决定两个DataWrap的大小
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
		System.out.println("开始排序：\n");
		int arrayLength = data.length;
		for (int i = 1 ; i < arrayLength ; i++ )
		{
			// 当整体后移时，保证data[i]的值不会丢失
			DataWrap tmp = data[i];
			// i索引处的值已经比前面所有值都大，表明已经有序，无需插入
			//（i-1索引之前的数据已经有序的，i-1索引处元素的值就是最大值）
			if (data[i].compareTo(data[i - 1]) < 0)
			{
				int j = i - 1;
				//整体后移一格
				for ( ; j >= 0 && data[j].compareTo(tmp) > 0 ; j--)
				{
					data[j + 1] = data[j];
				}
				// 最后将tmp的值插入合适位置
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		insertSort(data);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}
