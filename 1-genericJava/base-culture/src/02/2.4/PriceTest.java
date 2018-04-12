

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
class Price
{
	// ���Ա��Priceʵ��
	final static Price INSTANCE = new Price(2.8);
	// �ڶ���һ���������
	final static double initPrice = 20;
	// �����Price��currentPriceʵ������
	double currentPrice;
	public Price(double discount)
	{
		// ���ݾ�̬��������ʵ������
		currentPrice = initPrice - discount;
	}
}
public class PriceTest
{
	public static void main(String[] args)
	{
		// ͨ��Price��INSTANCE����currentPriceʵ������
		System.out.println(Price.INSTANCE.currentPrice); //��
		// ��ʽ����Priceʵ��
		Price p = new Price(2.8);
		// ͨ�����Ǵ�����Priceʵ������currentPriceʵ������
		System.out.println(p.currentPrice);              //��
	}
}

