package lee;

import org.apache.log4j.Logger;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class LogQs
{
	// �Ը��������������һ��Logger
	static Logger logger = Logger.getLogger(LogQs.class);
	public static void main(String[] args)
	{
		// ʹ��Logger���DEBUG�������Ϣ
		logger.debug("��ʼִ�г���");
		try
		{
			Thread.sleep(100);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		// ʹ��Logger���INFO�������Ϣ
		logger.info("����ִ����100ms");
		try
		{
			Thread.sleep(200);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		// ʹ��Logger���WARN�������Ϣ
		logger.warn("����������ִ����300ms");
		// ʹ��Logger���ERROR�������Ϣ
		logger.error("����������ִ����300ms");
		// ʹ��Logger���FATAL�������Ϣ
		logger.fatal("����������ִ����300ms");
	}
}