
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
public class ObjectArrayTest
{
	public static void main(String[] args)
	{
		// ���塢����ʼ��һ��Object����
		Object[] objArr = new Object[3];
		// ��objArr����������ĵڶ���Ԫ���ٴ�
		// ָ��һ������Ϊ2��Object[]����
		objArr[1] = new Object[2];              //��
		// ��objArr[1]��ֵ����objArr2������objArr2
		// ��objArr[1]ָ��ͬһ���������
		Object[] objArr2 = (Object[])objArr[1]; //��
		// ��objArr2����������ĵڶ���Ԫ���ٴ�
		// ָ��һ������Ϊ3��Object[]����
		objArr2[1] = new Object[3];             //��
		// ��objArr2[1]��ֵ����objArr3������objArr3
		// ��objArr2[1]ָ��ͬһ���������
		Object[] objArr3 = (Object[])objArr2[1];//��
		// ��objArr3����������ĵڶ���Ԫ���ٴ�
		// ָ��һ������Ϊ5��int[]����
		objArr3[1] = new int[5];                //��
		// ��objArr3[1]��ֵ����iArr������iArr��
		// objArr3[1]ָ��ͬһ���������
		int[] iArr = (int[])objArr3[1];         //��
		// ����ΪiArr�����ÿ��Ԫ�ظ�ֵ
		for (int i = 0 ; i < iArr.length ; i++ )
		{
			iArr[i] = i * 3 + 1;
		}
		// ֱ��ͨ��objArr����iArr����ĵ�3��Ԫ��
		System.out.println( ((int[])((Object[])((Object[])
			objArr[1])[1])[1])[2] );           //��
	}
}
