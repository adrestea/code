

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

enum Season
{
	SPRING,SUMMER,FALL,WINTER
}
public class EnumSwitch
{
	public static void main(String[] args)
	{
		Season s = Season.FALL;
		switch (s)
		{
			case SPRING:
				System.out.println("���첻�Ƕ�����");
				break;
			case SUMMER:
				System.out.println("��������������");
				break;
			case FALL:
				System.out.println("�����Ӭ");
				break;
			case WINTER:
				System.out.println("������");
				break;
		}
	}
}
