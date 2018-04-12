
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
		// ��a��������һ��û�з��������ı�����
		// ϵͳ���������з�����Ϣ��Ҳ���ǲ������м����������Ϣ
		// Ҳ����˵b�������getAppleSizes()�������ٷ���List<String>��
		// ���Ƿ���List
		Apple b = a;                  //��
		for (String apple : b.getApples())   //��
		{
			System.out.println(apple);
		}
	}
}
