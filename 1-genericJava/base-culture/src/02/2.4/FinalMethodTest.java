

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
class Base
{
	private final void info()
	{
		System.out.println("Base��info����");
	}
}
public class FinalMethodTest extends Base
{
	// ���info���������Ǹ��Ǹ��෽����
//	@Override
	public void info()
	{
		System.out.println("FinalMethodTest��Info����");
	}
}
