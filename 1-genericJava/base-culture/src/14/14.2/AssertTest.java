

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
public class AssertTest
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 12;
		// ģ��һ�θ��ӵļ���
		int c = (a << 2) * 3 + b - 20;
		// ����a > 3
		assert c > 3;
		// ����a == 52
		assert c == 52;
		// ����a < 52,������ʾ:"a��С��52����a��ֵΪ��" + c
		assert c < 52 : "c��С��52����c��ֵΪ��" + c;
		System.out.println("==����֮��==");
	}
}