

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
public class LinkQueueTest
{
	public static void main(String[] args)
	{
		LinkQueue<String> queue
			= new LinkQueue<String>("aaaa");
		// �������Ԫ��
		queue.add("bbbb");
		queue.add("cccc");
		System.out.println(queue);
		// ɾ��һ��Ԫ�غ�
		queue.remove();
		System.out.println("ɾ��һ��Ԫ�غ�Ķ��У�" + queue);
		// �ٴ����һ��Ԫ��
		queue.add("dddd");
		System.out.println("�ٴ����Ԫ�غ�Ķ��У�" + queue);
		// ɾ��һ��Ԫ�غ󣬶��п����ٶ��һ��Ԫ��
		queue.remove();
		// �ٴμ���һ��Ԫ��
		queue.add("eeee");
		System.out.println(queue);
	}
}
