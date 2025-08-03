package com.ait.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class CitizenBinding {

	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStrtDate;
	private LocalDate planEndDate;

}
