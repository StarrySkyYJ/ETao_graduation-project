package cn.space.tao.cart.vo;

import cn.space.tao.items.vo.Items;

/**
 * 购物项对象
 * @author SPACE
 *
 */
public class CartItem {
	private Items items ;  //购物项商品信息
	private int count ;	   //购买某种商品数量
	private double subtotal ;   //购买某种商品金额小计
	
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
	//小计自动计算
	public double getSubtotal() {
		return count * items.getPrice() ;
	}
/*	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	*/
	
}
