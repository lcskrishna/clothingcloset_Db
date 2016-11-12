package com.clothingcloset.impl;

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
	public boolean validatePBLStaff(PBLStaff pblStaff) {
		boolean isValidPBLStaffMember = pblStaffLoginHandler.validateStaffLogin(pblStaff);
		return false;
	}



	@Override
	public void insertPBLStaffLoginDetails(PBLStaff pblStaff) {
		// TODO Auto-generated method stub
		
	}

	

}
