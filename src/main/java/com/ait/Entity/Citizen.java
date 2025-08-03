package com.ait.Entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="CITIZEN_PLANS")
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private  String gender;
	private  String planName;
	private  String planStatus;
	private  LocalDate planStrtDate;
	private  LocalDate planEndDate;
	private  Double benefitAmt;
	private  String denialReason;
	private  LocalDate terminatedDate;
	private  String terminatedRsn;
}
