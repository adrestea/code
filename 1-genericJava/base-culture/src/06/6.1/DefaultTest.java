

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
public class DefaultTest
{
	public static void main(String[] args)
	{
		// ��������score����Ϊ�丳ֵΪ'C'
		char score = 'C';
		// ִ��swicth��֧���
		switch (score)
		{
			case 'A':
				System.out.println("����.");
				break;
			case 'B':
				System.out.println("����.");
				break;
			case 'C':
				System.out.println("��.");
				break;
			case 'D':
				System.out.println("����.");
				break;
			case 'E':
				System.out.println("������.");
				break;
			// default��֧��һ��Ǳ�ڵ�������
			// ���ʽ��ֵ��ǰ�����з�֧��ֵ�����
			// ֻ�в�ִ��ǰ�����з�֧ʱ�Ż�ִ�и÷�֧
			default:
				System.out.println("�ɼ��������.");
		}
	}
}
