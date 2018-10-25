package cn.space.tao.items.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.space.tao.items.dao.ItemsDao;
import cn.space.tao.items.vo.Items;

/**
 * ��Ʒ   ҵ������
 * @author SPACE
 *
 */
@Transactional
public class ItemsService {
	//ע��ItemsDao
	private ItemsDao itemsDao;

	public void setItemsDao(ItemsDao itemsDao) {
		this.itemsDao = itemsDao;
	}

	//��ҳ�ϵ�������Ʒ
	public List<Items> findHot() {
		return itemsDao.findHot();
	}

	//������ƷID ��ѯ��Ʒ
	public Items findById(Integer id) {
		return itemsDao.findById(id);
	}
}
