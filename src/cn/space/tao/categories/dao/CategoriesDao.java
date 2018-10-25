package cn.space.tao.categories.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.space.tao.categories.vo.Categories;

public class CategoriesDao extends HibernateDaoSupport {

	//Dao层的查询所有一级分类的方法
	public List<Categories> findAll() {
		String hql = "from Categories";
		List<Categories> list =(List<Categories>)this.getHibernateTemplate().find(hql);
		return list;
	}

}
