package cn.space.tao.cart.vo;

import cn.space.tao.items.vo.Items;

/**
 * ���������
 * @author SPACE
 *
 */
public class CartItem {
	private Items items ;  //��������Ʒ��Ϣ
	private int count ;	   //����ĳ����Ʒ����
	private double subtotal ;   //����ĳ����Ʒ���С��
	
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	//С���Զ�����
	public double getSubtotal() {
		return count * items.getPrice() ;
	}
/*	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	*/
	
}
