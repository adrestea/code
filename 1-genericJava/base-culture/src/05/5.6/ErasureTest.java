

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
}
public class ErasureTest
{
	public static void main(String[] args)
	{
		Apple<Integer> a = new Apple<Integer>(6); //��
		// a��getSize��������Integer����
		Integer as = a.getSize();
		// ��a���󸳸�Apple�������ᶪʧ���������������Ϣ
		Apple b = a;               //��
		// bֻ֪��size��������Number
		Number size1 = b.getSize();
		// �����������������
		Integer size2 = b.getSize();   //��
	}
}