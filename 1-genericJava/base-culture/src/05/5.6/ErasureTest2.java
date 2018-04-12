
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
class Apple<T extends Number>
{
	T size;
	public Apple()
	{
	}
	public Apple(T size)
	{
		this.size = size;
	}
	public void setSize (T size)
	{
		this.size = size;
	}
	public T getSize()
	{
		 return this.size;
	}
	public List<String> getApples()
	{
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 3 ; i++ )
		{
			list.add(new Apple<Integer>(10 * i).toString());
		}
		return list;
	}
	public String toString()
	{
		return "Apple[size=" + size + "]";
	}
}
public class ErasureTest2
{
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<Integer>(6);
		for (String apple : a.getApples() )
		{
			System.out.println(apple);
		}
		// 将a变量赋给一个没有泛型声明的变量，
		// 系统将擦除所有泛型信息，也就是擦除所有尖括号里的信息
		// 也就是说b对象调用getAppleSizes()方法不再返回List<String>，
		// 而是返回List
		Apple b = a;                  //①
		for (String apple : b.getApples())   //②
		{
			System.out.println(apple);
		}
	}
}
