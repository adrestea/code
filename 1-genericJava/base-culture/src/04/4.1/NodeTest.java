

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

class Node
{
	Node next;
	String name;
	public Node(String name)
	{
		this.name = name;
	}
}
public class NodeTest
{
	public static void main(String[] args)
	{
		Node n1 = new Node("第一个节点");
		Node n2 = new Node("第二个节点");
		Node n3 = new Node("第三个节点");
		n1.next = n2;
		n3 = n2;
		n2 = null;
	}
}
