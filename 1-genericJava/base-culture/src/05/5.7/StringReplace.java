

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
public class StringReplace
{
	public static void main(String[] args)
	{
		String clazz = "org.crazyit.auction.model.Item";
		// ʹ��replace�ͱȽϼ�
		String path1 = clazz.replace("." , "\\");
		System.out.println(path1);
		// ʹ��replaceAll���Ӷ��ˣ���Ҫ��.��\����ת��
		String path2 = clazz.replaceAll("\\." , "\\\\");
		System.out.println(path2);
	}
}
