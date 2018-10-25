package cn.space.tao.categoriesinfo.vo;

import cn.space.tao.categories.vo.Categories;

/**
 * 二级分类的实体
 * @author SPACE
 *
 */
public class CategoriesInfo {
	private Integer id ;
	private String cname;
	// 所属一级分类，存在的是一级分类的对象
	private Categories categories;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	
}
