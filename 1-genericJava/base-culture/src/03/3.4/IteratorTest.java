
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
enum Gender
{
	MALE , FEMALE;
}
public class IteratorTest
{
	public static void main(String[] args)
	{
		// 创建一个HashSet集合
		HashSet<String> hashSet = new HashSet<>();
		// 获取HashSet集合的Iterator
		System.out.println("HashSet的Iterator:"
			+ hashSet.iterator());
		// 创建一个LinkedHashSet集合
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		// 获取LinkedHashSet集合的Iterator
		System.out.println("LinkedHashSet的Iterator:"
			+ linkedHashSet.iterator());
		// 创建一个TreeSet集合
		TreeSet<String> treeSet = new TreeSet<>();
		// 获取TreeSet集合的Iterator
		System.out.println("TreeSet的Iterator:"
			+ treeSet.iterator());
		// 创建一个EnumSet集合
		EnumSet<Gender> enumSet = EnumSet.allOf(Gender.class);
		// 获取EnumSet集合的Iterator
		System.out.println("EnumSet的Iterator:"
			+ enumSet.iterator());
		// 创建一个ArrayList集合
		ArrayList<String> arrayList = new ArrayList<>();
		// 获取ArrayList集合的Iterator
		System.out.println("ArrayList的Iterator:"
			+ arrayList.iterator());
		// 创建一个Vector集合
		Vector<String> vector = new Vector<>();
		// 获取Vector集合的Iterator
		System.out.println("Vector的Iterator:"
			+ vector.iterator());
		// 创建一个LinkedList集合
		LinkedList<String> linkedList = new LinkedList<>();
		// 获取LinkedList集合的Iterator
		System.out.println("LinkedList的Iterator:"
			+ linkedList.iterator());
		// 创建一个ArrayDeque集合
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		// 获取ArrayDeque集合的Iterator
		System.out.println("ArrayDeque的Iterator:"
			+ arrayDeque.iterator());
	}
}
