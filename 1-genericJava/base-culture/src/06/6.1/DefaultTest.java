

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
public class DefaultTest
{
	public static void main(String[] args)
	{
		// 声明变量score，并为其赋值为'C'
		char score = 'C';
		// 执行swicth分支语句
		switch (score)
		{
			case 'A':
				System.out.println("优秀.");
				break;
			case 'B':
				System.out.println("良好.");
				break;
			case 'C':
				System.out.println("中.");
				break;
			case 'D':
				System.out.println("及格.");
				break;
			case 'E':
				System.out.println("不及格.");
				break;
			// default分支有一个潜在的条件：
			// 表达式的值与前面所有分支的值不相等
			// 只有不执行前面所有分支时才会执行该分支
			default:
				System.out.println("成绩输入错误.");
		}
	}
}
