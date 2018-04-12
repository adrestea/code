

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
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
				System.out.println("春天不是读书天");
				break;
			case SUMMER:
				System.out.println("夏日炎炎正好眠");
				break;
			case FALL:
				System.out.println("秋多蚊蝇");
				break;
			case WINTER:
				System.out.println("冬日冷");
				break;
		}
	}
}
