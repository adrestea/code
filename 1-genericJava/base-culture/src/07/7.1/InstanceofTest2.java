

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
public class InstanceofTest2
{
	public static void main(String[] args)
	{
		Object str = "���Java����";
		// ִ��ǿ������ת��
		// ��math����ԭ��str���õĶ���
		Math math = (Math)str;          //��
		System.out.println("�ַ����Ƿ���String��ʵ����"
			+ (math instanceof String));//��
	}
}
