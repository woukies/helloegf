package egovframework.item_project.service;

import java.util.List;

public interface ItemService {
	List<?> selectItemList() throws Exception;
	ItemVO selectItemDetail(String name) throws Exception;
	void insertItem(ItemVO vo) throws Exception;
	void deleteItem(String name) throws Exception;
	void updateItem(ItemVO vo) throws Exception;
}
