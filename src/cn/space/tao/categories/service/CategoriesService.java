package cn.space.tao.categories.service;

import java.util.List;

import cn.space.tao.categories.dao.CategoriesDao;
import cn.space.tao.categories.vo.Categories;

/**
 * һ������ ҵ������
 * @author SPACE
 *
 */
public class CategoriesService {
	// ע��CategoriesDao
	private CategoriesDao categoriesDao ;

	public void setCategoriesDao(CategoriesDao categoriesDao) {
		this.categoriesDao = categoriesDao;
	}

	
	//ҵ����ѯ����һ�����෽��
	public List<Categories> findAll() {
		return categoriesDao.findAll();
	}

	
}
