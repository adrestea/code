

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
public class MutableString
{
	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("Hello ");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// ׷��"Java"
		str.append("Java");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// ׷��", crazyit.org"
		str.append(", crazyit.org");
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	}
}
