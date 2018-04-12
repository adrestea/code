
import java.util.*;
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
class Name
{
	private String first;
	private String last;
	public Name(String first, String last)
	{
		this.first = first;
		this.last = last;
	}
	// ����first�ж�����Name�Ƿ����
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o.getClass() == Name.class)
		{
			Name n = (Name)o;
			return n.first.equals(first);
		}
		return false;
	}
	// ����first����Name�����hashCode()����ֵ
	public int hashCode()
	{
		return first.hashCode();
	}
	public String toString()
	{
		return "Name[first=" + first + ", last=" + last + "]";
	}
}
public class HashSetTest2
{
	public static void main(String[] args)
	{
		HashSet<Name> set = new HashSet<>();
		set.add(new Name("abc" , "123"));
		set.add(new Name("abc" , "456"));
		System.out.println(set);  //��
	}
}
