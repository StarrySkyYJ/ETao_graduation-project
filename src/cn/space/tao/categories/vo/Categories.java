package cn.space.tao.categories.vo;

import java.util.HashSet;
import java.util.Set;

import cn.space.tao.categoriesinfo.vo.CategoriesInfo;


/**
 * ��ҳһ�������ʵ���ࣻ һ�������Ӧ�����������
 * @author SPACE
 *
 */
public class Categories {
	private Integer id ;
	private String categories;
	
	//һ�������д��ڶ�������ļ��ϣ�
	private Set<CategoriesInfo> categoriesInfo = new HashSet<CategoriesInfo>();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public Set<CategoriesInfo> getCategoriesInfo() {
		return categoriesInfo;
	}
	public void setCategoriesInfo(Set<CategoriesInfo> categoriesInfo) {
		this.categoriesInfo = categoriesInfo;
	}
	
	
}
