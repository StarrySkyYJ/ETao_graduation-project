package cn.space.tao.cart.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cn.space.tao.cart.vo.Cart;
import cn.space.tao.cart.vo.CartItem;
import cn.space.tao.items.service.ItemsService;
import cn.space.tao.items.vo.Items;

/**
 * ���ﳵAction
 * @author SPACE
 *
 */
public class CartAction extends ActionSupport {
	//����id
	private Integer id ;
	//����count 
	private Integer count ;
	
	//ע��service,����id��ȡ��Ʒ
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


	//��ת���� ,
	//����������ӵ����ﳵ��ִ�еķ���
	public String addCart(){
		//��װһ��CartItem ����
		CartItem cartItem = new CartItem();
		//����������
		cartItem.setCount(count);
		//����id���в�ѯ��Ʒ��
		Items items = itemsService.findById(id);
		//������Ʒ��
		cartItem.setItems(items);
		//����������ӵ����ﳵ
		//���ﳵӦ�ô���session��
		Cart cart = getCart();
		cart.addCart(cartItem);
		
		
		return "addCart";
		
	}
	//��ȡ���ﳵ�ķ�������session�л�ȡ���ﳵ
	private Cart getCart() {
		Cart cart =(Cart) ServletActionContext.getRequest().getSession().getAttribute("cart");
		if(cart == null){
			cart = new Cart();
			ServletActionContext.getRequest().getSession()
			.setAttribute("cart", cart);
		}
		
		return cart;
	}
	
	//��չ��ﳵ
	public String clearCart(){
		Cart cart = getCart();
		cart.clearCart();
		return "clearCart";
	}
	
	//menu.jsp ��ת�ҵĹ��ﳵ
	public String myCart(){
		return "myCart";
	}
}	
