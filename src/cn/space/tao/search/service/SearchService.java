package cn.space.tao.search.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.items.vo.Items;
import cn.space.tao.search.dao.SearchDao;

@Transactional
public class SearchService {
	private SearchDao searchDao;
	
	
	
	public void setSearchDao(SearchDao searchDao) {
		this.searchDao = searchDao;
	}



	public List<Items> menuSearch(String search) {
		return searchDao.menuSearch(search);
	}

}
