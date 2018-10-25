package cn.space.tao.search.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.space.tao.items.vo.Items;
import cn.space.tao.search.service.SearchService;

public class SearchAction extends ActionSupport {
	//接收search字段
	private String search ;
	
	private SearchService searchService ;
	
	
	public void setSearch(String search) {
		this.search = search;
	}
		
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}




	//数据库查找
	public String menuSearch(){
		//System.out.println(search);
		List<Items> ilist =  searchService.menuSearch(search);
		System.out.println("搜索数据字段: "+search);
		System.out.println("搜索数据大小: "+ilist.size());
		//存入值栈
		ActionContext.getContext().getValueStack().set("ilist", ilist);
		return "menuSearch";
	}
	
	
}	
