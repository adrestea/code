

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
public class OverrideTest3
{
	public void info(Object obj , double count)
	{
		System.out.println("obj����Ϊ��" + obj);   //��
		System.out.println("count����Ϊ��" + count);
	}
	public void info(Object[] objs , double count)
	{
		System.out.println("objs����Ϊ��" + objs);  //��
		System.out.println("count����Ϊ��" + count);
	}
	public static void main(String[] args)
	{
		OverrideTest3 ot = new OverrideTest3();
		// ��ͼ����ot��info����
		ot.info(null , 5);
	}
}
