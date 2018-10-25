package cn.space.tao.items.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.space.tao.items.service.ItemsService;
import cn.space.tao.items.vo.Items;

/**
 * 商品 Action对象
 * @author SPACE
 *
 */
public class ItemsAction extends ActionSupport implements ModelDriven<Items> {

	//用于接收数据的模型驱动
	private Items items  = new Items() ; // 实体类初始化
	
	//注入商品的service
	private ItemsService itemsService;
	
	public Items getModel() {
		return items;
	}
	public void setItemsService(ItemsService itemsService) {
		this.itemsService = itemsService;
	}
	
	//根据商品的ID进行查询商品：执行方法：
	public String findById(){
		//调用Service的方法完成查询
		items = itemsService.findById(items.getId());
		return "findById";
	}

}
