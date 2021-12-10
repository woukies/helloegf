package egovframework.item_project.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.item_project.service.ItemVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("itemDAO")
public class ItemDAO extends EgovAbstractDAO {
	public List<?> selectItemList() throws Exception {
		return list("itemDao.selectItemList");
	}

	public ItemVO selectItemDetail(String name) throws Exception {
		return (ItemVO) select("itemDao.selectItemDetail", name);
	}

	public void insertItem(ItemVO vo) throws Exception {
		insert("itemDao.insertItem", vo);
	}

	public void deleteItem(String name) throws Exception {
		delete("itemDao.deleteItem", name);
	}

	public void updateItem(ItemVO vo) throws Exception {
		update("itemDao.updateItem", vo);
	}
}
