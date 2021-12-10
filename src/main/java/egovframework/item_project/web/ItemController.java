package egovframework.item_project.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.item_project.service.ItemService;
import egovframework.item_project.service.ItemVO;

@Controller
public class ItemController {
	@Resource(name = "itemService")
	private ItemService itemService;
	
	@RequestMapping("/itemList.do")
	public String selectItemList(ModelMap model) throws Exception {
		List<?> itemList = itemService.selectItemList();
		model.addAttribute("resultList", itemList);
		
		return "item/content_view";
	}
	
	@RequestMapping("/itemWrite.do")
	public String insertItem() {
		return "item/itemWrite";
	}
	
	@RequestMapping(value = "/itemWriteSave.do")
	public String insertItemSave(ItemVO vo) throws Exception {
		itemService.insertItem(vo);
		
		return "item/writeResult";
	}
}
