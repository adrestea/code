

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
public class ConversionTest
{
	public static void main(String[] args)
	{
		Object obj = "Hello";
		// obj�����ı�������ΪObject����String���͵ĸ��࣬
		// ����ǿ������ת��������obj����ʵ�������õ�Ҳ��String����
		// ��������ʱҲ����
		String objStr = (String)obj;    //��
		System.out.println(objStr);
		// ����һ��objPri��������������ΪObject��ʵ������ΪInteger
		Object objPri = new Integer(5);
		// objPri�����ı�������ΪObject����String���͵ĸ��࣬
		// ����ǿ������ת������obj����ʵ�������õ���Integer����
		// ���������������ʱ����ClassCastException�쳣
		String str = (String)objPri;    //��
		String s = "���Java����";
		// ��Ϊs�ı���ʱ������String��String����Math����
		// StringҲ����Math�����࣬Ҳ����Math�ĸ��࣬
		// ����������뵼�±������
		Math m = (Math)s;                //��
	}
}
