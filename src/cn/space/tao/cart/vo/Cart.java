package cn.space.tao.cart.vo;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ���ﳵ����
 * @author SPACE
 *
 */
public class Cart {
//	������� : Map��key������Ʒid�� value�������
//	hashmap����ʹ��linkehashmap ��������
	private Map<Integer, CartItem> map = new LinkedHashMap<Integer, CartItem>();
	
	//Ϊʹֵ���û�ȡ����map<key,value>ת��Ϊvalue��
	public Collection<CartItem> getCartItems(){
		return map.values();
		
	}
	
	//�����ܼ�
	private double total ;
	
	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotal() {
		return total;
	}


	//���ﳵ�Ĺ���
	//1.�����ﳵ����ӵ����ﳵ
	public void addCart(CartItem cartItem){
		//�жϹ��ﳵ���Ƿ��Ѿ����ڸù�����
		/*
		 * ������ڣ�
		 * 		��������
		 * 		�ܼ� = �ܼ� + ������С��
		 * ��������ڣ�
		 * 		��map����ӹ�����
		 * 		�ܼ� = �ܼ� + ������С��
		 * 
		*/
		//�����Ʒ��id
		Integer id =cartItem.getItems().getId();
		//�жϹ��ﳵ���Ƿ��Ѿ����ڸù����
		if(map.containsKey(id)){
			//����
			CartItem _cartItem = map.get(id);//��ù��ﳵ��ԭ���Ĺ�����
			_cartItem.setCount(cartItem.getCount()+cartItem.getCount());;
			
		}else{
			//������
			map.put(id, cartItem);
		}
		total += cartItem.getSubtotal();
		System.out.println("�ܽ�"+total);
	}
	
	//2.�ӹ��ﳵ���Ƴ�������
	public void removeCart(Integer id){
		//���������Ƴ����ﳵ
		CartItem cartItem = map.remove(id);
		//�ܼ� = �ܼ�-�Ƴ��Ĺ�����С��
		total -= cartItem.getSubtotal();
	}
	
	//3.��չ��ﳵ
	public void clearCart(){
		//�����й��������
		map.clear();
		//���ܼ�����Ϊ0
		total = 0 ;
	}
}
