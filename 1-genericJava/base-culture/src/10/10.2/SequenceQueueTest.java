
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
public class SequenceQueueTest
{
	public static void main(String[] args)
	{
		SequenceQueue<String> queue = new SequenceQueue<String>();
		// ���ν�4��Ԫ�ؼ������
		queue.add("aaaa");
		queue.add("bbbb");
		queue.add("cccc");
		queue.add("dddd");
		System.out.println(queue);
		System.out.println("���ʶ��е�front��Ԫ��:"
			+ queue.element());
		System.out.println("�Ƴ����е�front��Ԫ��:"
			+ queue.remove());
		System.out.println("�Ƴ����е�front��Ԫ��:"
			+ queue.remove());
		System.out.println("���ε���remove������Ķ��У�"
			+ queue);
	}
}
