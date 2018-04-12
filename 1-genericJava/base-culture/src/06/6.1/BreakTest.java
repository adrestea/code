

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
public class BreakTest
{
	public static void main(String[] args)
	{
		// 声明变量score，并为其赋值为'C'
		char score = 'C';
		// 执行swicth分支语句
		switch (score)
		{
			case 'A':
			{
				System.out.println("优秀.");
			}
			case 'B':
			{
				System.out.println("良好.");
			}
			case 'C':
			{
				System.out.println("中.");
			}
			case 'D':
			{
				System.out.println("及格.");
			}
			case 'E':
			{
				System.out.println("不及格.");
			}
			default:
				System.out.println("成绩输入错误.");
		}
	}
}
