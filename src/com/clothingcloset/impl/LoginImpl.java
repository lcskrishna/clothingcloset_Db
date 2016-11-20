package com.clothingcloset.impl;

import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.clothingcloset.api.Login;
import com.clothingcloset.handlers.PBLStaffLoginHandler;
import com.clothingcloset.handlers.PersonHandler;
import com.clothingcloset.handlers.UserLoginHandler;
import com.clothingcloset.models.PBLStaff;
import com.clothingcloset.models.Person;
import com.clothingcloset.models.UserLogin;

@Component
public class LoginImpl implements Login {

	// Declarations
	PersonHandler personHandler = new PersonHandler();
	UserLoginHandler userLoginHandler = new UserLoginHandler();
	PBLStaffLoginHandler pblStaffLoginHandler = new PBLStaffLoginHandler();
	

	@Override
	public boolean registerPerson(Person person){
		return personHandler.registerPerson(person);
	}

	@Override
	public boolean validateUser(UserLogin userLogin) {
		boolean isValidUser = userLoginHandler.validateUserLogin(userLogin);
		return isValidUser;
	}

	@Override
	public String validatePBLStaff(PBLStaff pblStaff) {
		return pblStaffLoginHandler.validateStaffLogin(pblStaff);
		
	}



	@Override
	public void insertPBLStaffLoginDetails(PBLStaff pblStaff)  {
		try {
			pblStaffLoginHandler.insertPBLStaffLoginDetails(pblStaff);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void retrieveStaffMembers() {
		// TODO Auto-generated method stub
		
	}

	

}
