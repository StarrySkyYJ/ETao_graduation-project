package cn.space.tao.categories.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.space.tao.categories.vo.Categories;

public class CategoriesDao extends HibernateDaoSupport {

	//Dao��Ĳ�ѯ����һ������ķ���
	public List<Categories> findAll() {
		String hql = "from Categories";
		List<Categories> list =(List<Categories>)this.getHibernateTemplate().find(hql);
		return list;
	}

}
