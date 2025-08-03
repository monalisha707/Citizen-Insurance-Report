package com.ait.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;

import com.ait.Entity.Citizen;
import com.ait.binding.CitizenBinding;
import com.ait.repository.CitizenPlanRepository;
import com.ait.service.CitizenService;

public class ServiceImpl implements CitizenService{

	 private CitizenPlanRepository repo;
	
	@Override
	public List<String> planName() {
		List<String> planName = repo.getPlanName();
	
		return planName;
	}

	@Override
	public List<String> planStatus() {
		List<String> planStatus = repo.getPlanStatus();
		return planStatus;
	}

	@Override
	public List<Citizen> getAllCitizen(CitizenBinding citizen) {
		
	
		return null;
	}
	
	

}
