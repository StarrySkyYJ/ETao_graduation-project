package cn.space.tao.categoriesinfo.vo;

import cn.space.tao.categories.vo.Categories;

/**
 * ���������ʵ��
 * @author SPACE
 *
 */
public class CategoriesInfo {
	private Integer id ;
	private String cname;
	// ����һ�����࣬���ڵ���һ������Ķ���
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
