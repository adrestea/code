import java.lang.ref.*;

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
public class StrongReferenceTest
{
	public static void main(String[] args)
		throws Exception
	{
		Person[] people =
			new Person[100000];
		for (int i = 0 ; i < people.length ; i++)
		{
			people[i] = new Person(
				"����" + i , (i + 1) * 4 % 100);
		}
		System.out.println(people[2]);
		System.out.println(people[4]);
		// ֪ͨϵͳ������������
		System.gc();
		System.runFinalization();
		// StrongReference�����ﲻ���κ�Ӱ��
		System.out.println(people[2]);
		System.out.println(people[4]);
	}
}
