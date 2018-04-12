

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
class Base
{
	// test方法是private访问权限，子类不可访问该方法
	private void test()
	{
		System.out.println("父类的test方法");
	}
}
public class Sub extends Base
{
	// 此处并不是方法重写
	@Override
	public void test()
	{
		System.out.println("子类定义的test方法");
	}
}

