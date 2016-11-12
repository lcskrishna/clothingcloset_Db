/**
 * 
 */
package com.clothingcloset.handlers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.clothingcloset.databaseconnections.ConnectionUtil;
import com.clothingcloset.models.PBLStaff;
import com.clothingcloset.models.UserLogin;

/**
 * This class is responsible for all the login operations of the PBL Staff members.
 * @author Chaitanya Sri Krishna Lolla.
 *
 */
public class PBLStaffLoginHandler {
	
	private ConnectionUtil connectionUtil = new ConnectionUtil();
	private Statement stmt = null;
	private Connection conn = null;
	
	
	public void insertPBLStaffLoginDetails(PBLStaff pblStaff) throws ClassNotFoundException, SQLException {

		try {
			conn = (Connection) connectionUtil.connectToDatabase();
			stmt = conn.createStatement();

			String sql = "INSERT INTO PBLSTAFF_TABLE (EMAIL,PBLPOSITION,PASSWORD,ID) VALUES ( '"
					+ pblStaff.getEmail() + "','" + pblStaff.getPblPosition() + "','" + pblStaff.getPassword() + "',"
					+ pblStaff.getId() + ");";

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

	public boolean validateStaffLogin(PBLStaff pblStaff) {

		boolean isValidMember = false;
		
		try {
			conn = (Connection) connectionUtil.connectToDatabase();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PBLSTAFF_TABLE WHERE EMAIL ="+pblStaff.getEmail()
			+"AND PASSWORD="+pblStaff.getPassword();

			System.out.println("SQL Query is : " + sql);
			ResultSet resultSet = stmt.executeQuery(sql);
			if(resultSet.next()){
				isValidMember = true;
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

		

		return isValidMember;
	}


}
