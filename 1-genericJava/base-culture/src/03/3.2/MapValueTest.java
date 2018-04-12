
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
public class MapValueTest
{
	public static void main(String[] args)
	{
		HashMap<String , Double> scores = new HashMap<>();
		scores.put("语文" , 89.0);
		scores.put("数学" , 83.0);
		scores.put("英文" , 80.0);
		// 输出scores集合的values()方法返回值
		System.out.println(scores.values());
		System.out.println(scores.values().getClass());
		TreeMap<String , Double> health = new TreeMap<>();
		health.put("身高" , 173.0);
		health.put("体重" , 71.2);
		// 输出health集合的values()方法返回值
		System.out.println(health.values());
		System.out.println(health.values().getClass());
	}
}
