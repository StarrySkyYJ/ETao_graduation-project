package cn.space.tao.cart.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.space.tao.cart.vo.Cart;
import cn.space.tao.cart.vo.CartItem;
import cn.space.tao.items.service.ItemsService;
import cn.space.tao.items.vo.Items;

/**
 * 购物车Action
 * @author SPACE
 *
 */
public class CartAction extends ActionSupport {
	//接收id
	private Integer id ;
	//接收count 
	private Integer count ;
	
	//注入service,根据id获取商品
	private ItemsService itemsService;
		
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}

	public void setItemsService(ItemsService itemsService) {
		this.itemsService = itemsService;
	}


	//跳转界面 ,
	//将购物项添加到购物车：执行的方法
	public String addCart(){
		//封装一个CartItem 对象
		CartItem cartItem = new CartItem();
		//设置数量：
		cartItem.setCount(count);
		//根据id进行查询商品：
		Items items = itemsService.findById(id);
		//设置商品：
		cartItem.setItems(items);
		//将购物项添加到购物车
		//购物车应该存在session中
		Cart cart = getCart();
		cart.addCart(cartItem);
		
		
		return "addCart";
		
	}
	//获取购物车的方法：从session中获取购物车
	private Cart getCart() {
		Cart cart =(Cart) ServletActionContext.getRequest().getSession().getAttribute("cart");
		if(cart == null){
			cart = new Cart();
			ServletActionContext.getRequest().getSession()
			.setAttribute("cart", cart);
		}
		
		return cart;
	}
	
	//清空购物车
	public String clearCart(){
		Cart cart = getCart();
		cart.clearCart();
		return "clearCart";
	}
	
	//menu.jsp 跳转我的购物车
	public String myCart(){
		return "myCart";
	}
}	
