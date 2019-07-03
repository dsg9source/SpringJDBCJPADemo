package com.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="passport")

public class Passport {
	@Id
	@GeneratedValue
	private int passportId;
	@Column(name="counrty")
	private String passportCountry;
	@OneToOne(fetch=FetchType.LAZY,mappedBy="passport")
	private Employee employee;
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportCountry() {
		return passportCountry;
	}
	public void setPassportCountry(String passportCountry) {
		this.passportCountry = passportCountry;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String toString() {
		return passportId+"  "+passportCountry;
	}
	
	
}
