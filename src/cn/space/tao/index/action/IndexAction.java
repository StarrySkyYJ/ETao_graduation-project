package cn.space.tao.index.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.space.tao.categories.service.CategoriesService;
import cn.space.tao.categories.vo.Categories;
import cn.space.tao.items.service.ItemsService;
import cn.space.tao.items.vo.Items;

/**
 *  ��ҳ
 * @author SPACE
 *
 */
public class IndexAction extends ActionSupport{
	
	//ע��һ�������Service
	private CategoriesService categoriesService;
	//ע����Ʒ�� Service
	private ItemsService itemsService ;
	
	
	
	public void setItemsService(ItemsService itemsService) {
		this.itemsService = itemsService;
	}


	public void setCategoriesService(CategoriesService categoriesService) {
		this.categoriesService = categoriesService;
	}
	

	//��ҳ���ʵķ���
	public String execute() {
		//��ѯ����һ������ļ���
		List<Categories> cList = categoriesService.findAll();
		
		//��һ��������뵽Session�ķ�Χ��
		ActionContext.getContext().getSession().put("cList", cList);
				
			
		//��ѯ������Ʒ
		List<Items> hlist = itemsService.findHot();
		//���浽ֵջ��
		ActionContext.getContext().getValueStack().set("hlist", hlist);
		return "index";
	}
}
