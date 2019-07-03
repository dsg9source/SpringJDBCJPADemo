package com.jpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Department {
	@Id
	@Column(name="deptno")
	private int departmentNo;
	@Column(name="dname")
	private String departmentName;
	@Column(name="loc")
	private String location;
	@OneToMany(mappedBy="dept")
	private List<Employee> employees;
	
	
	
	public Department() {
		employees=new ArrayList<Employee>();
	}
	
	
	public int getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return departmentNo+" "+departmentName+" "+location;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Employee emp) {
		employees.add(emp);
	}
	
}
