

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
public class CompositeAssign
{
	public static void main(String[] args)
	{
		short st = 5;
		// 没有任何问题，系统执行隐式的类型转换
		st += 10;
		System.out.println(st);
		// 此时有问题了，因为系统有一个隐式的类型转换，将会发生精度丢失
		st += 90000;
		System.out.println(st);
	}
}
