package com.ait.runner;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ait.Entity.Citizen;
import com.ait.repository.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private CitizenPlanRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Cash Plan Data
		Citizen c1 = new Citizen();

		c1.setCitizenName("Ghose");
		c1.setGender("male");
		c1.setPlanName("cash plan");
		c1.setPlanStatus("Sucess");
		c1.setPlanStrtDate(LocalDate.now().minusMonths(6));
		c1.setPlanEndDate(LocalDate.now().plusMonths(8));
		c1.setBenefitAmt(50000.0);

		Citizen c2 = new Citizen();
		
		c2.setCitizenName("Shyam");
		c2.setGender("male");
		c2.setPlanName("cash plan");
		c2.setPlanStatus("denied");
		c2.setDenialReason("employed");

		Citizen c3 = new Citizen();

		c3.setCitizenName("Joshn");
		c3.setGender("female");
		c3.setPlanName("cash plan");
		c3.setPlanStatus("Teminated");
		c3.setPlanStrtDate(LocalDate.now().minusMonths(7));
		c3.setPlanEndDate(LocalDate.now().plusMonths(12));
		c3.setBenefitAmt(6000.0);
		c3.setTerminatedDate(LocalDate.now().minusMonths(3));
		c3.setTerminatedRsn("have cash already");

		// Health plan

		Citizen c4 = new Citizen();

		c4.setCitizenName("misti");
		c4.setGender("female");
		c4.setPlanName("Health plan");
		c4.setPlanStatus("Sucess");
		c4.setPlanStrtDate(LocalDate.now().minusMonths(5));
		c4.setPlanEndDate(LocalDate.now().plusMonths(5));
		c4.setBenefitAmt(17000.0);

		Citizen c5 = new Citizen();

		c5.setCitizenName("John");
		c5.setGender("male");
		c5.setPlanName("Health plan");
		c5.setPlanStatus("denied");
		c5.setDenialReason("having sufficient money");

		Citizen c6 = new Citizen();

		c6.setCitizenName("meyna");
		c6.setGender("female");
		c6.setPlanName("Health plan");
		c6.setPlanStatus("Teminated");
		c6.setPlanStrtDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(14));
		c6.setBenefitAmt(150000.0);
		c6.setTerminatedDate(LocalDate.now().minusMonths(2));
		c6.setTerminatedRsn("having not sufficient document");

		// Education plan

		Citizen c7 = new Citizen();

		c7.setCitizenName("Jack");
		c7.setGender("male");
		c7.setPlanName("Education plan");
		c7.setPlanStatus("Sucess");
		c7.setPlanStrtDate(LocalDate.now().minusMonths(9));
		c7.setPlanEndDate(LocalDate.now().plusMonths(9));
		c7.setBenefitAmt(19000.0);

		Citizen c8 = new Citizen();

		c8.setCitizenName("shreya");
		c8.setGender("female");
		c8.setPlanName("Education plan");
		c8.setPlanStatus("denied");
		c8.setDenialReason("study completed");

		Citizen c9 = new Citizen();

		c9.setCitizenName("mohani");
		c9.setGender("female");
		c9.setPlanName("Education plan");
		c9.setPlanStatus("Teminated");
		c9.setPlanStrtDate(LocalDate.now().minusMonths(10));
		c9.setPlanEndDate(LocalDate.now().plusMonths(11));
		c9.setBenefitAmt(2000.0);
		c9.setTerminatedDate(LocalDate.now().minusMonths(2));
		c9.setTerminatedRsn("Graduated already");

		
		List<Citizen> asList = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9);
		repo.saveAll(asList);
	}

}
