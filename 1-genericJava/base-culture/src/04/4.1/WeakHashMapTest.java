import java.util.*;
import java.lang.ref.*;

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

class CrazyKey
{
	String name;
	public CrazyKey(String name)
	{
		this.name = name;
	}
	// 重写hashCode()方法
	public int hashCode()
	{
		return name.hashCode();
	}
	// 重写equals方法
	public boolean equals(Object obj)
	{
		if (obj == this)
		{
			return true;
		}
		if (obj != null && obj.getClass() == CrazyKey.class)
		{
			return name.equals(((CrazyKey)obj).name);
		}
		return false;
	}
	// 重写toString()方法
	public String toString()
	{
		return "CrazyKey[name=" + name + "]";
	}
}
public class WeakHashMapTest
{
	public static void main(String[] args) throws Exception
	{
		WeakHashMap<CrazyKey , String> map
			= new WeakHashMap<CrazyKey , String>();
		// 循环放入10个key-value对
		for (int i = 0 ; i < 10 ; i++)
		{
			map.put(new CrazyKey(i + 1 + "") , "value" + (i + 11));
		}
		// 垃圾回收之前，WeakHashMap与普通HashMap并无区别
		System.out.println(map);
		System.out.println(map.get(new CrazyKey("2")));
		// 通知垃圾回收
		System.gc();
		// 暂停当前线程50ms，让垃圾回收后台线程获得执行
		Thread.sleep(50);
		// 垃圾回收后，WeakHashMap里所有Entry全部清空
		System.out.println(map);
		System.out.println(map.get(new CrazyKey("2")));
	}
}
