package com.clothingcloset.impl;

import java.util.List;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

import org.springframework.stereotype.Component;

import com.clothingcloset.api.ItemService;
import com.clothingcloset.handlers.ItemServiceHandler;
import com.clothingcloset.models.Item;

@Component
public class ItemServiceImpl implements ItemService{
	
	ItemServiceHandler itemServiceHandler= new ItemServiceHandler();

	@Override
	public List<Item> retrieveAllItemsBasedOnCategory(String categoryName) {
		return itemServiceHandler.retrieveAllItemsBasedOnCategory(categoryName);
	}

}
