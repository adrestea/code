

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
public class CompositeAssign
{
	public static void main(String[] args)
	{
		short st = 5;
		// û���κ����⣬ϵͳִ����ʽ������ת��
		st += 10;
		System.out.println(st);
		// ��ʱ�������ˣ���Ϊϵͳ��һ����ʽ������ת�������ᷢ�����ȶ�ʧ
		st += 90000;
		System.out.println(st);
	}
}
