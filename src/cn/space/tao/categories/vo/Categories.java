package cn.space.tao.categories.vo;

import java.util.HashSet;
import java.util.Set;

import cn.space.tao.categoriesinfo.vo.CategoriesInfo;


/**
 * 首页一级分类的实体类； 一级分类对应多个二级分类
 * @author SPACE
 *
 */
public class Categories {
	private Integer id ;
	private String categories;
	
	//一级分类中存在二级分类的集合：
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
