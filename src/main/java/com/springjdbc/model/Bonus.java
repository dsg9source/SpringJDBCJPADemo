package com.springjdbc.model;

public class Bonus {
	private String employeeName;
	private String job;
	private float sal;
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
	private float comm;
	
	
	public String toString() {
		return employeeName+" "+job+" "+sal+" "+comm;
	}

}
