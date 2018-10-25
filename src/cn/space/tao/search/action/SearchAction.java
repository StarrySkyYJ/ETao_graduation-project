package cn.space.tao.search.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.space.tao.items.vo.Items;
import cn.space.tao.search.service.SearchService;

public class SearchAction extends ActionSupport {
	//����search�ֶ�
	private String search ;
	
	private SearchService searchService ;
	
	
	public void setSearch(String search) {
		this.search = search;
	}
		
	public void setSearchService(SearchService searchService) {
		this.searchService = searchService;
	}




	//���ݿ����
	public String menuSearch(){
		//System.out.println(search);
		List<Items> ilist =  searchService.menuSearch(search);
		System.out.println("���������ֶ�: "+search);
		System.out.println("�������ݴ�С: "+ilist.size());
		//����ֵջ
		ActionContext.getContext().getValueStack().set("ilist", ilist);
		return "menuSearch";
	}
	
	
}	
