
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
public class ShellSort
{
	public static void shellSort(DataWrap[] data)
	{
		System.out.println("开始排序：");
		int arrayLength = data.length;
		// h变量保存可变增量
		int h = 1;
		// 按h * 3 + 1得到增量序列的最大值
		while(h <= arrayLength / 3)
		{
			h = h * 3 + 1;
		}
		while(h > 0)
		{
			System.out.println("===h的值:" + h + "===");
			for (int i = h ; i < arrayLength ; i++ )
			{
				// 当整体后移时，保证data[i]的值不会丢失
				DataWrap tmp = data[i];
				// i索引处的值已经比前面所有值都大，表明已经有序，无需插入
				// （i-1索引之前的数据已经有序的，i-1索引处元素的值就是最大值）
				if (data[i].compareTo(data[i - h]) < 0)
				{
					int j = i - h;
					// 整体后移h格
					for ( ; j >= 0 && data[j].compareTo(tmp) > 0 ; j-=h)
					{
						data[j + h] = data[j];
					}
					// 最后将tmp的值插入合适位置
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
		System.out.println("排序之前：\n"
			+ java.util.Arrays.toString(data));
		shellSort(data);
		System.out.println("排序之后：\n"
			+ java.util.Arrays.toString(data));
	}
}
