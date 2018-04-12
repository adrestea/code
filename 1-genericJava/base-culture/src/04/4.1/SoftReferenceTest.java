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
class Person
{
	String name;
	int age;
	public Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return "Person[name=" + name
			+ ", age=" + age + "]";
	}
}
public class SoftReferenceTest
{
	public static void main(String[] args)
		throws Exception
	{
		SoftReference<Person>[] people =
			new SoftReference[100000];
		for (int i = 0 ; i < people.length ; i++)
		{
			people[i] = new SoftReference<Person>(new Person(
				"名字" + i , (i + 1) * 4 % 100));
		}
		System.out.println(people[2].get());
		System.out.println(people[4].get());
		// 通知系统进行垃圾回收
		System.gc();
		System.runFinalization();
		// 垃圾回收机制运行之后，SoftReference数组里的元素保持不变
		System.out.println(people[2].get());
		System.out.println(people[4].get());
	}
}
