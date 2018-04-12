import java.util.*;
import java.lang.ref.*;

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

class CrazyKey
{
	String name;
	public CrazyKey(String name)
	{
		this.name = name;
	}
	// ��дhashCode()����
	public int hashCode()
	{
		return name.hashCode();
	}
	// ��дequals����
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
	// ��дtoString()����
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
		// ѭ������10��key-value��
		for (int i = 0 ; i < 10 ; i++)
		{
			map.put(new CrazyKey(i + 1 + "") , "value" + (i + 11));
		}
		// ��������֮ǰ��WeakHashMap����ͨHashMap��������
		System.out.println(map);
		System.out.println(map.get(new CrazyKey("2")));
		// ֪ͨ��������
		System.gc();
		// ��ͣ��ǰ�߳�50ms�����������պ�̨�̻߳��ִ��
		Thread.sleep(50);
		// �������պ�WeakHashMap������Entryȫ�����
		System.out.println(map);
		System.out.println(map.get(new CrazyKey("2")));
	}
}
