package com.jpa.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	@Column(name="empno")
	private int employeeId;
	@Column(name="ename")
	private String employeeName;
	@Column(name="job")
	private String job;
	@Column(name="mgr")
	private int mgr;
	@Column(name="hiredate")
	private Date hireDate;
	@Column(name="sal")
	private float sal;
	@Column(name="comm")
	private Float comm;
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="deptno")
	private Department dept;
	@OneToOne(fetch=FetchType.LAZY)
	Passport passport;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
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
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
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
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	public String toString() {
		return employeeId+" "+employeeName+" "+job+" "+mgr+" "+hireDate+" "+sal+" "+comm+" "+dept;
	}

}
