

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
public class ArrayTest3
{
	public static void main(String[] args)
	{
		// 定义、并初始化nums数组
		int[] nums = new int[]{3, 5, 20, 12};
		// 定义一个prices数组变量
		int[] prices;
		// 让prices数组指向nums所引用的数组
		prices = nums;
		for (int i = 0 ; i < prices.length ; i++ )
		{
			System.out.println(prices[i]);
		}
		// 将prices数组的第3个元素赋值为34
		prices[2] = 34;
		// 访问nums数组的第3个元素，将看到输出34.
		System.out.println("nums数组的第3个元素的值是：" + nums[2]);
	}
}
