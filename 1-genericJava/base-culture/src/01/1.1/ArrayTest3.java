

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
public class ArrayTest3
{
	public static void main(String[] args)
	{
		// ���塢����ʼ��nums����
		int[] nums = new int[]{3, 5, 20, 12};
		// ����һ��prices�������
		int[] prices;
		// ��prices����ָ��nums�����õ�����
		prices = nums;
		for (int i = 0 ; i < prices.length ; i++ )
		{
			System.out.println(prices[i]);
		}
		// ��prices����ĵ�3��Ԫ�ظ�ֵΪ34
		prices[2] = 34;
		// ����nums����ĵ�3��Ԫ�أ����������34.
		System.out.println("nums����ĵ�3��Ԫ�ص�ֵ�ǣ�" + nums[2]);
	}
}
