/**
 * 
 */
package com.clothingcloset.handlers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.clothingcloset.databaseconnections.ConnectionUtil;
import com.clothingcloset.models.PBLStaff;

/**
 * This class is responsible for all the login operations of the PBL Staff
 * members.
 * 
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

			String sql = "INSERT INTO PBLSTAFF_TABLE (EMAIL,PBLPOSITION,PASSWORD,ID) VALUES ( '" + pblStaff.getEmail()
					+ "','" + pblStaff.getPblPosition() + "','" + pblStaff.getPassword() + "'," + pblStaff.getId()
					+ ");";

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

	public String validateStaffLogin(PBLStaff pblStaff) {

		String pblPosition = "";

		try {
			conn = (Connection) connectionUtil.connectToDatabase();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PBLSTAFF_TABLE WHERE EMAIL ='" + pblStaff.getEmail() + "'AND PASSWORD='"
					+ pblStaff.getPassword() + "';";

			System.out.println("SQL Query is : " + sql);
			ResultSet resultSet = stmt.executeQuery(sql);

			if (resultSet.next()) {
				pblPosition = (String) resultSet.getString("PBLPOSITION");
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

		return pblPosition;
	}

	public List<PBLStaff> retrieveAllStaffMembers() {

		List<PBLStaff> staffMembers = new ArrayList<PBLStaff>();
		try {
			conn = (Connection) connectionUtil.connectToDatabase();
			stmt = conn.createStatement();

			String sql = "SELECT * FROM PBLSTAFF_TABLE";

			System.out.println("SQL Query is : " + sql);
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				String pblPosition = resultSet.getString("PBLPOSITION");
				if (!pblPosition.equalsIgnoreCase("ADMIN")) {
					PBLStaff pblStaff = new PBLStaff();
					pblStaff.setId(resultSet.getInt("ID"));
					pblStaff.setEmail(resultSet.getString("EMAIL"));
					pblStaff.setPblPosition(pblPosition);
					pblStaff.setPassword(resultSet.getString("PASSWORD"));
					staffMembers.add(pblStaff);
				}
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

		return staffMembers;

	}

}
