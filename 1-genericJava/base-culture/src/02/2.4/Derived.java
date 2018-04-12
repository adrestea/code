
package org.leegang;

import org.crazyit.Base;
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
public class Derived extends Base
{
	//这个info方法并不是覆盖父类方法。
//	@Override
	private void info()
	{
		System.out.println("Derived类的info方法");
	}
}
