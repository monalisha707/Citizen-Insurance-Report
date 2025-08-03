package com.ait.service;

import java.util.List;

import com.ait.Entity.Citizen;
import com.ait.binding.CitizenBinding;

public interface CitizenService {
	
	public List<String> planName();
	
	public List<String> planStatus();
	
	public List<Citizen> getAllCitizen(CitizenBinding citizen);
	
	
	
	
}
