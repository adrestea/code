

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
public class OverrideTest2
{
	public void info(String name , double count)   //��
	{
		System.out.println("name����Ϊ��" + name);
		System.out.println("count����Ϊ��" + count);
	}
	public void info(String name , int count)     //��
	{
		System.out.println("name����Ϊ��" + name);
		System.out.println("���͵�count����Ϊ��" + count);
	}
	public static void main(String[] args)
	{
		OverrideTest2 ot = new OverrideTest2();
		// ��ͼ����ot��info����
		ot.info("crazyit.org" , 5);
	}
}
