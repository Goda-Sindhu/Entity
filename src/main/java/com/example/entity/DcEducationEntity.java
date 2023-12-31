package com.example.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Dc_Education")
public class DcEducationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	
	private String highestDegree;
	private Integer graduationYear;
	private String university;
	//private Integer caseNumber;
	
	@OneToOne
	@JoinColumn(name="case_number")
	private IesCitizenAppsEntity education;


}
