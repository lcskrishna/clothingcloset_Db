package com.clothingcloset.handlers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.clothingcloset.databaseconnections.ConnectionUtil;
import com.clothingcloset.models.Item;
import com.mysql.jdbc.ResultSet;
/**
 * This class is responsible for all the operations related to Item.
 * @author Chaitanya Sri Krishna Lolla.
 *
 */
public class ItemServiceHandler {
	
	private static ConnectionUtil connectionUtil = new ConnectionUtil();
	
	public List<Item> retrieveAllItemsBasedOnCategory(String categoryName){
		
		Connection conn = null;
		Statement stmt = null;
		List<Item> items = new ArrayList<Item>();
		
		
		try {
			conn = connectionUtil.connectToDatabase();

			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			String sql  = "SELECT CATEGORY_ID FROM CATEGORY_TABLE WHERE CATEGORY_NAME = '"+categoryName+"';";
			System.out.println(sql);
			
			ResultSet resultSet = (ResultSet) stmt.executeQuery(sql);
			int id = 0;
			if(resultSet.next()){
				id = resultSet.getInt("CATEGORY_ID");
			}
			
			String sql1 = "SELECT * FROM ITEM_TABLE WHERE CATEGORY_ID = "+id+";";
			System.out.println(sql1);
			ResultSet resultSet_item = (ResultSet) stmt.executeQuery(sql1);
			while(resultSet_item.next()){
				Item item = setItemDetails(resultSet_item);
				items.add(item);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
	
		return items;
	}

	private Item setItemDetails(ResultSet resultSet_item) throws SQLException {
		Item item = new Item();
		item.setCategoryId(resultSet_item.getInt("CATEGORY_ID"));
		item.setItemId(resultSet_item.getInt("ITEM_ID"));
		item.setItemName(resultSet_item.getString("ITEM_NAME"));
		item.setSize(resultSet_item.getString("SIZE"));
		item.setColor(resultSet_item.getString("COLOR"));
		item.setQuantity(resultSet_item.getInt("QUANTITY"));
		item.setItemCondition(resultSet_item.getString("ITEM_CONDITION"));
		item.setDescription(resultSet_item.getString("DESCRIPTION"));
		item.setItemDate(resultSet_item.getDate("ITEM_ADDED_DATE").toString());
		item.setBrand(resultSet_item.getString("BRAND"));
		item.setGender(resultSet_item.getString("GENDER"));
		item.setPrice(resultSet_item.getFloat("PRICE"));
		return item;
	}

}
