package com.clothingcloset.testclient;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.clothingcloset.impl.DonationServiceImpl;
import com.clothingcloset.impl.LoginImpl;
import com.clothingcloset.models.Donation;
import com.clothingcloset.models.Person;
import com.clothingcloset.models.UserLogin;

public class TestClient {

	public static void main(String[] args) {
		
		TestClient testClient = new TestClient();
/*		boolean isUserRegistered= testClient.registerPerson();
		if(isUserRegistered){
			System.out.println("USER IS REGISTERED SUCCESSFULLY");
		}*/
		
//		boolean isValidUser = testClient.validateUser();
//		if(isValidUser){
//			System.out.println("VALID USER");
//		}else
//		{
//			System.out.println("INVALID USER");
//		}
//		boolean isItemDonated= testClient.donateItem();
//		if(isItemDonated){
//			System.out.println("SUCCESSFULLY DONATED WILL RECEIVE RECEIPT SHORTLY");
//		}else{
//			System.out.println("ITEM NOT DONATED PLEASE RETRY.");
//		}
		
		testClient.displayItemsForChecking();
		
	}
	
	public  boolean registerPerson(){
		
		LoginImpl login = new LoginImpl();
		boolean isUserRegistered= false;
		
		Person person = new Person();
		person.setFirstName("Chaitanya Sri Krishna");
		person.setLastName("Lolla");
		person.setGender("Male");
		person.setMobileNumber("9803187958");
		person.setStreet("UTD");
		person.setCity("Charlotte");
		person.setState("NC");
		person.setPincode(28262);
		person.setEmail("lollachaitanya@yahoo.com");
		person.setSubscription("Y");
		person.setPassword("chaitanya");
		person.setRole("Alumni");
		
		isUserRegistered = login.registerPerson(person);
		
		return isUserRegistered;
	}
	
	public boolean validateUser(){
		LoginImpl login = new LoginImpl();
		UserLogin userLogin = new UserLogin();
		userLogin.setEmail("lollachaitanya@yahoo.com");
		userLogin.setPassword("xyz");
		
		boolean isValidUser = login.validateUser(userLogin);
		return isValidUser;
	}
	
	public boolean donateItem(){
		Donation donation = new Donation();
		donation.setEmail("lollachaitanya@yahoo.com");
		donation.setDateOfDonation("2016-11-11");
		donation.setChecked(1);
		donation.setItemName("Jeans");
		donation.setSize("M");
		donation.setQuantity(2);
		donation.setColor("Blue");
		donation.setItem_Condition("Good");
		donation.setDescription("BrandNew");
		donation.setGender("Male");
		donation.setBrand("Denimx");
		
		DonationServiceImpl donationServiceImpl = new DonationServiceImpl();
		return donationServiceImpl.donateItems(donation);
	}
	
	public void displayItemsForChecking(){
		DonationServiceImpl donationServiceImpl = new DonationServiceImpl();
		List<Donation> donations = donationServiceImpl.retrieveDonatedItems();
		
		Iterator<Donation> iterator = donations.iterator();
		while(iterator.hasNext()){
			Donation donation = iterator.next();
			System.out.println(donation.toString());
		}
		
	}
}
