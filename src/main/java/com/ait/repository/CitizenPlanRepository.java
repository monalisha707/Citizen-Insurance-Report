package com.ait.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ait.Entity.Citizen;


public interface CitizenPlanRepository  extends JpaRepository<Citizen, Integer> {

}
