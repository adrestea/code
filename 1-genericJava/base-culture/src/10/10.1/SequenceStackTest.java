

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
public class SequenceStackTest
{
	public static void main(String[] args)
	{
		SequenceStack<String> stack =
			new SequenceStack<String>();
		// ���ϵ���ջ
		stack.push("aaaa");
		stack.push("bbbb");
		stack.push("cccc");
		stack.push("dddd");
		System.out.println(stack);
		// ����ջ��Ԫ��
		System.out.println("����ջ��Ԫ�أ�" + stack.peek());
		// ����һ��Ԫ��
		System.out.println("��һ�ε���ջ��Ԫ�أ�" + stack.pop());
		// �ٴε���һ��Ԫ��
		System.out.println("�ڶ��ε���ջ��Ԫ�أ�" + stack.pop());
		System.out.println("����pop֮���ջ��" + stack);
	}
}
