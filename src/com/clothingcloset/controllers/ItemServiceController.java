package com.clothingcloset.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clothingcloset.api.ItemService;
import com.clothingcloset.models.Item;

/**
 * @author Chaitanya Sri Krishna Lolla.
 *
 */
@Controller
@RequestMapping("/itemdisplay")
public class ItemServiceController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	   public ModelAndView person() {
	      return new ModelAndView("items", "command", new Item());
	   }
	
	@RequestMapping(value= "/displayAllItems",method=RequestMethod.POST)
	public String registerPerson(@ModelAttribute("SpringWeb")Item item, 
			   ModelMap model){
		
		List<Item> items = itemService.retrieveAllItemsBasedOnCategory(item.getCategoryName());
		
		for(Item i:items){
			System.out.println(i.toString());
		}
		
		return "items";
		
	}
	
	
}
