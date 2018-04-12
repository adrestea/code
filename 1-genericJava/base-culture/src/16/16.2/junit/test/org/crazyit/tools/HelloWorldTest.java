package org.crazyit.tools;

import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

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
public class HelloWorldTest
{
	@Test
	public void testSayHello()
	{
		HelloWorld hello = new HelloWorld();
		assertEquals("sayHello方法出错：" , hello.sayHello()
			, "Hello world.");
	}
	@Test
	public void testAdd()
	{
		HelloWorld hello = new HelloWorld();
		assertEquals(hello.add(1,2),3);
	}
}
