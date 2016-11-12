package com.clothingcloset.impl;

import java.util.List;

import com.clothingcloset.api.DonationService;
import com.clothingcloset.handlers.DonationHandler;
import com.clothingcloset.models.Donation;

public class DonationServiceImpl implements DonationService{

	DonationHandler donationHandler = new DonationHandler();
	@Override
	public boolean donateItems(Donation donation) {
		return donationHandler.donateItem(donation);
	}
	
	@Override
	public List<Donation> retrieveDonatedItems() {
		// TODO Auto-generated method stub
		return donationHandler.getDonatedItems();
	}

}
