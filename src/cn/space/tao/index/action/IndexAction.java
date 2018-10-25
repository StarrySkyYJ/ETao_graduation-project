package cn.space.tao.index.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.space.tao.categories.service.CategoriesService;
import cn.space.tao.categories.vo.Categories;
import cn.space.tao.items.service.ItemsService;
import cn.space.tao.items.vo.Items;

/**
 *  首页
 * @author SPACE
 *
 */
public class IndexAction extends ActionSupport{
	
	//注入一级分类的Service
	private CategoriesService categoriesService;
	//注入商品的 Service
	private ItemsService itemsService ;
	
	
	
	public void setItemsService(ItemsService itemsService) {
		this.itemsService = itemsService;
	}


	public void setCategoriesService(CategoriesService categoriesService) {
		this.categoriesService = categoriesService;
	}
	

	//首页访问的方法
	public String execute() {
		//查询所有一级分类的集合
		List<Categories> cList = categoriesService.findAll();
		
		//将一级分类存入到Session的范围：
		ActionContext.getContext().getSession().put("cList", cList);
				
			
		//查询热门商品
		List<Items> hlist = itemsService.findHot();
		//保存到值栈中
		ActionContext.getContext().getValueStack().set("hlist", hlist);
		return "index";
	}
}
