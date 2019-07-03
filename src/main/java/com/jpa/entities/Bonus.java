package com.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bonus")
public class Bonus {
	@Id
	@Column(name="ename")
	private String employeeName;
	@Column(name="job")
	private String job;
	@Column(name="salary")
	private float sal;
	@Column(name="comm")
	private float comm;
	
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	public float getComm() {
		return comm;
	}
	public void setComm(float comm) {
		this.comm = comm;
	}
	
	
	
	public String toString() {
		return employeeName+" "+job+" "+sal+" "+comm;
	}

}
