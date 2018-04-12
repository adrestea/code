

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
public class OverrideTest3
{
	public void info(Object obj , double count)
	{
		System.out.println("obj参数为：" + obj);   //①
		System.out.println("count参数为：" + count);
	}
	public void info(Object[] objs , double count)
	{
		System.out.println("objs参数为：" + objs);  //②
		System.out.println("count参数为：" + count);
	}
	public static void main(String[] args)
	{
		OverrideTest3 ot = new OverrideTest3();
		// 试图调用ot的info方法
		ot.info(null , 5);
	}
}
