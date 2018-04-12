package lee;

import org.apache.log4j.Logger;

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
public class LogQs
{
	// 以该类的类名来创建一个Logger
	static Logger logger = Logger.getLogger(LogQs.class);
	public static void main(String[] args)
	{
		// 使用Logger输出DEBUG级别的消息
		logger.debug("开始执行程序");
		try
		{
			Thread.sleep(100);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		// 使用Logger输出INFO级别的消息
		logger.info("程序执行了100ms");
		try
		{
			Thread.sleep(200);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		// 使用Logger输出WARN级别的消息
		logger.warn("程序运行了执行了300ms");
		// 使用Logger输出ERROR级别的消息
		logger.error("程序运行了执行了300ms");
		// 使用Logger输出FATAL级别的消息
		logger.fatal("程序运行了执行了300ms");
	}
}