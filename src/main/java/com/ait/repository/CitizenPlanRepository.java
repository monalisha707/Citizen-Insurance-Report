package com.ait.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ait.Entity.Citizen;


public interface CitizenPlanRepository  extends JpaRepository<Citizen, Integer> {
	
	@Query("SELECT DISTINCT(planName) FROM Citizen")
	public List<String> getPlanName();
	
	@Query("SELECT DISTINCT(planStatus) FROM Citizen")
	public List<String> getPlanStatus();
	
	

}
