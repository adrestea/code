

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
class Person
{
	String name;
	int age;
	static int eyeNum;
	public void info()
	{
		System.out.println("�ҵ������ǣ�" + name
			+ "�� �ҵ������ǣ�" + age);
	}
}
public class FieldTest
{
	public static void main(String[] args)
	{
		// ��������ڸ��౾��ֻҪ�����ʼ����ɣ�
		// ���򼴿�ʹ���������
		Person.eyeNum = 2; 		  //��
		// ͨ��Person�����eyeNum�����
		System.out.println("Person��eyeNum���ԣ�"
			+ Person.eyeNum);
		// ������һ��Person����
		Person p = new Person();
		p.name = "��˽�";
		p.age = 300;
		// ͨ��p����Person���eyeNum�����
		System.out.println("ͨ��p��������eyeNum�������"
			+ p.eyeNum);           //��
		p.info();
		// �����ڶ���Person����
		Person p2 = new Person();
		p2.name = "�����";
		p2.age = 500;
		p2.info();
		// ͨ��p2�޸�Person���eyeNum�����
		p2.eyeNum = 3;     		   //��
		// �ֱ�ͨ��p��p2��Person����Person���eyeNum�����
		System.out.println("ͨ��p��������eyeNum�������"
			+ p.eyeNum);
		System.out.println("ͨ��p2��������eyeNum�������"
			+ p2.eyeNum);
		System.out.println("ͨ��Person�����eyeNum�������"
			+ Person.eyeNum);
	}
}
