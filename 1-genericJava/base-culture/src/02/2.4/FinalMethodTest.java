

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
	private final void info()
	{
		System.out.println("Base的info方法");
	}
}
public class FinalMethodTest extends Base
{
	// 这个info方法并不是覆盖父类方法。
//	@Override
	public void info()
	{
		System.out.println("FinalMethodTest的Info方法");
	}
}
