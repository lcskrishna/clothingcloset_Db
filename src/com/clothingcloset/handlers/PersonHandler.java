package com.clothingcloset.handlers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.clothingcloset.databaseconnections.ConnectionUtil;
import com.clothingcloset.models.Person;
import com.mysql.jdbc.ResultSet;

public class PersonHandler {

	private static ConnectionUtil connectionUtil = new ConnectionUtil();

	public boolean registerPerson(Person person) {

		Connection conn = null;
		boolean isUserRegistered = false;
		Statement stmt = null;

		try {
			conn = connectionUtil.connectToDatabase();

			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			String sql = "INSERT INTO PERSON_TABLE (FIRST_NAME,LAST_NAME,GENDER,MOBILE_NUMBER,STREET,CITY,STATE,PINCODE) VALUES ( '"
					+ person.getFirstName() + "','" + person.getLastName() + "','" + person.getGender() + "',"
					+ person.getMobileNumber() + ",'" + person.getStreet() + "','" + person.getCity() + "','"
					+ person.getState() + "'," + person.getPincode() + ");";
			
			System.out.println("SQL Query is : " + sql);
			stmt.executeUpdate(sql);
			
			String sql1= "SELECT ID FROM PERSON_TABLE WHERE FIRST_NAME = '"+person.getFirstName()+"' AND LAST_NAME= '"+person.getLastName()+"';";
			System.out.println(sql1);
			
			ResultSet resultSet = (ResultSet) stmt.executeQuery(sql1);
			int id = 0;
			while(resultSet.next()){
				id = resultSet.getInt("ID");
				
			}
			
			String sql2 = "INSERT INTO USER_TABLE (EMAIL,PASSWORD,ROLE,SUBSCRIPTION,ID) VALUES ('"
					+person.getEmail()+"','"+person.getPassword()+"','"+person.getRole()+"','"+person.getSubscription()
					+"',"+id+");";
			
			System.out.println("SQL Query is : "+sql2);
			stmt.executeUpdate(sql2);
			
			isUserRegistered = true;
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
		return isUserRegistered;

	}
}
