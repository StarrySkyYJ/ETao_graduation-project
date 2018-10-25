package cn.space.tao.categories.service;

import java.util.List;

import cn.space.tao.categories.dao.CategoriesDao;
import cn.space.tao.categories.vo.Categories;

/**
 * 一级分类 业务层对象
 * @author SPACE
 *
 */
public class CategoriesService {
	// 注入CategoriesDao
	private CategoriesDao categoriesDao ;

	public void setCategoriesDao(CategoriesDao categoriesDao) {
		this.categoriesDao = categoriesDao;
	}

	
	//业务层查询所有一级分类方法
	public List<Categories> findAll() {
		return categoriesDao.findAll();
	}

	
}
