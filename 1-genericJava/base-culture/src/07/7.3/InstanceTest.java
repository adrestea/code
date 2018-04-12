

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
public class InstanceTest
{
	private String name;
	// ���е�ǰ���ʵ��
	private InstanceTest instance;
	// ����һ���޲����Ĺ�����
	public InstanceTest()
	{
	}
	// �����в����Ĺ�����
	public InstanceTest(String name)
	{
		// �����޲����Ĺ�������ʼ��intanceʵ��
		instance = new InstanceTest();
		instance.name = name;
	}
	// ��дtoString()����
	public String toString()
	{
		return "InstanceTest[instance="
			+ instance + "]";
	}
public static void main(String[] args)
{
	InstanceTest in = new InstanceTest();
	InstanceTest in2 = new InstanceTest("����name");
	// �����������໥����
	in.instance = in2;
	in2.instance = in;
	System.out.println(in);
	System.out.println(in2);
}
}
