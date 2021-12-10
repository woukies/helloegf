package egovframework.item_project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.item_project.service.ItemService;
import egovframework.item_project.service.ItemVO;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Resource(name = "itemDAO")
	private ItemDAO itemDAO;

	@Override
	public List<?> selectItemList() throws Exception {
		return itemDAO.selectItemList();
	}

	@Override
	public ItemVO selectItemDetail(String name) throws Exception {
		return itemDAO.selectItemDetail(name);
	}

	@Override
	public void insertItem(ItemVO vo) throws Exception {
		itemDAO.insertItem(vo);
	}

	@Override
	public void deleteItem(String name) throws Exception {
		itemDAO.deleteItem(name);
	}

	@Override
	public void updateItem(ItemVO vo) throws Exception {
		itemDAO.updateItem(vo);
	}
}