package com.clothingcloset.handlers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clothingcloset.databaseconnections.ConnectionUtil;
import com.clothingcloset.models.UserLogin;

/**
 * This class is responsible for the operations required for the User Login.
 * 
 * @author Chaitanya Sri Krishna Lolla.
 */
public class UserLoginHandler {

	private ConnectionUtil connectionUtil = new ConnectionUtil();
	private Statement stmt = null;
	private Connection conn = null;

	public void insertUserLoginDetails(UserLogin userLogin) throws ClassNotFoundException, SQLException {

		try {
			conn = (Connection) connectionUtil.connectToDatabase();
			stmt = conn.createStatement();

			String sql = "INSERT INTO USER_TABLE (EMAIL,ROLE,PASSWORD,ID,SUBSCRIPTION) VALUES ( '"
					+ userLogin.getEmail() + "','" + userLogin.getRole() + "','" + userLogin.getPassword() + "',"
					+ userLogin.getId() + ",'" + userLogin.getSubscription() + ");";

			System.out.println("SQL Query is : " + sql);
			stmt.executeUpdate(sql);

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
	}

	public boolean validateUserLogin(UserLogin userLogin) {

		boolean isValidUser = false;
		
		try {
			conn = (Connection) connectionUtil.connectToDatabase();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM USER_TABLE WHERE EMAIL ="+userLogin.getEmail()
			+"AND PASSWORD="+userLogin.getPassword();

			System.out.println("SQL Query is : " + sql);
			int resultSet = stmt.executeUpdate(sql);
			if(resultSet!=0){
				isValidUser= true;
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

		

		return isValidUser;
	}
}
