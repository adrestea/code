
import java.util.*;
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
interface IntArrayProductor
{
	// �ӿ��ﶨ���product�������ڷ�װ��������Ϊ��
	int product();
}
public class CommandTest
{
	// ����һ��������������ָ�����ȵ����飬
	// ��ÿ������Ԫ������cmd�������
	public int[] process(IntArrayProductor cmd , int length)
	{
		int[] result = new int[length];
		for (int i = 0; i < length ; i++ )
		{
			result[i] = cmd.product();
		}
		return result;
	}
	public static void main(String[] args)
	{
		CommandTest ct = new CommandTest();
		final int seed = 5;
		// �������飬�������ɷ�ʽȡ����IntArrayProductor�ӿڵ�����ʵ����
		int[] result = ct.process(new IntArrayProductor()
		{
			public int product()
			{
				return (int)Math.round(Math.random() * seed);
			}
		} , 6);
		System.out.println(Arrays.toString(result));
	}
}