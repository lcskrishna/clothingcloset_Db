
package com.clothingcloset.controllers;

/**
 * @author Chaitanya Sri Krishna Lolla.
 *This class is responsible for handling the Rest calls from Front end.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clothingcloset.api.Login;
import com.clothingcloset.models.PBLStaff;
import com.clothingcloset.models.Person;
import com.clothingcloset.models.UserLogin;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	Login login;
	
	
	@RequestMapping(value = "/person", method = RequestMethod.GET)
	   public ModelAndView person() {
	      return new ModelAndView("person", "command", new Person());
	   }
	
	@RequestMapping(value= "/registration",method=RequestMethod.POST)
	public String registerPerson(@ModelAttribute("SpringWeb")Person person, 
			   ModelMap model){
		
		boolean isRegistered= login.registerPerson(person);
		
		if(isRegistered){
			System.out.println("Registration for the person is successful.");
		}else{
			System.out.println("Registration was not successful.");
		}
		
		return "result";
		
	}
	
	// Login Implementation.
	
	@RequestMapping(value = "/loginPage", method = RequestMethod.GET)
	   public String login() {
		   return "loginPage";
	   }
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	   public ModelAndView userLogin() {
		
	      return new ModelAndView("userLoginPage", "command", new UserLogin());
	   }
	
	@RequestMapping(value="/userLoginPage",method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("SpringWeb") UserLogin userLogin){
		boolean isValidUser = login.validateUser(userLogin);
		if(isValidUser){
			System.out.println("Valid User");
		}else{
			System.out.println("In valid User");
		}
		
		return "decision";
		
	}
	
	@RequestMapping(value = "/pblStaffLogin", method = RequestMethod.GET)
	public ModelAndView pblStaffLogin(){
		return new ModelAndView("pblStaffLoginPage","command", new PBLStaff());
	}
	
	@RequestMapping(value="/pblStaffLoginPage",method = RequestMethod.POST)
	public String validatePBLStaffMember(@ModelAttribute("SpringWeb") PBLStaff pblStaff){
		boolean isValidUser = login.validatePBLStaff(pblStaff);
		if(isValidUser){
			System.out.println("Valid User");
		}else{
			System.out.println("In valid User");
		}
		
		return "decision";
		
	}
	
	
	
}
