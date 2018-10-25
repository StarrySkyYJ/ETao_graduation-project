package cn.space.tao.items.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.space.tao.items.service.ItemsService;
import cn.space.tao.items.vo.Items;

/**
 * ��Ʒ Action����
 * @author SPACE
 *
 */
public class ItemsAction extends ActionSupport implements ModelDriven<Items> {

	//���ڽ������ݵ�ģ������
	private Items items  = new Items() ; // ʵ�����ʼ��
	
	//ע����Ʒ��service
	private ItemsService itemsService;
	
	public Items getModel() {
		return items;
	}
	public void setItemsService(ItemsService itemsService) {
		this.itemsService = itemsService;
	}
	
	//������Ʒ��ID���в�ѯ��Ʒ��ִ�з�����
	public String findById(){
		//����Service�ķ�����ɲ�ѯ
		items = itemsService.findById(items.getId());
		return "findById";
	}

}
