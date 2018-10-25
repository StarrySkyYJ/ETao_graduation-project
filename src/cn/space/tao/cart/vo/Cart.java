package cn.space.tao.cart.vo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 购物车对象
 * @author SPACE
 *
 */
public class Cart {
//	购物项集合 : Map的key就是商品id， value：购物项；
//	hashmap无序，使用linkehashmap 有序排列
	private Map<Integer, CartItem> map = new LinkedHashMap<Integer, CartItem>();
	
	//为使值更好获取，将map<key,value>转化为value，
	public Collection<CartItem> getCartItems(){
		return map.values();
		
	}
	
	//购物总计
	private double total ;
	
	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotal() {
		return total;
	}


	//购物车的功能
	//1.将购物车项添加到购物车
	public void addCart(CartItem cartItem){
		//判断购物车中是否已经存在该购物项
		/*
		 * 如果存在：
		 * 		数量增加
		 * 		总计 = 总计 + 购物项小计
		 * 如果不存在：
		 * 		向map中添加购物项
		 * 		总计 = 总计 + 购物项小计
		 * 
		*/
		//获得商品的id
		Integer id =cartItem.getItems().getId();
		//判断购物车中是否已经存在该购物项：
		if(map.containsKey(id)){
			//存在
			CartItem _cartItem = map.get(id);//获得购物车中原来的购物项
			_cartItem.setCount(cartItem.getCount()+cartItem.getCount());;
			
		}else{
			//不存在
			map.put(id, cartItem);
		}
		total += cartItem.getSubtotal();
		System.out.println("总金额："+total);
	}
	
	//2.从购物车中移除购物项
	public void removeCart(Integer id){
		//将购物项移除购物车
		CartItem cartItem = map.remove(id);
		//总计 = 总计-移除的购物项小计
		total -= cartItem.getSubtotal();
	}
	
	//3.清空购物车
	public void clearCart(){
		//将所有购物项清空
		map.clear();
		//将总计设置为0
		total = 0 ;
	}
}
