
import java.util.*;
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
class Name
{
	private String first;
	private String last;
	public Name(String first, String last)
	{
		this.first = first;
		this.last = last;
	}
	// 根据first判断两个Name是否相等
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
	// 根据first计算Name对象的hashCode()返回值
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
		System.out.println(set);  //①
	}
}
