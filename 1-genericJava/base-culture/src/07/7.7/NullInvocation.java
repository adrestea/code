

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
public class NullInvocation
{
	public static void info()
	{
		System.out.println("��̬��info����");
	}
	public static void main(String[] args)
	{
		// ����һ��NullInvocation����������һ��null�����ñ���
		NullInvocation ni = null;
		ni.info();
	}
}
