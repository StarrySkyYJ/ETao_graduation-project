package cn.space.tao.items.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.items.dao.ItemsDao;
import cn.space.tao.items.vo.Items;

/**
 * 商品   业务层代码
 * @author SPACE
 *
 */
@Transactional
public class ItemsService {
	//注入ItemsDao
	private ItemsDao itemsDao;

	public void setItemsDao(ItemsDao itemsDao) {
		this.itemsDao = itemsDao;
	}

	//首页上的热门商品
	public List<Items> findHot() {
		return itemsDao.findHot();
	}

	//根据商品ID 查询商品
	public Items findById(Integer id) {
		return itemsDao.findById(id);
	}
}
