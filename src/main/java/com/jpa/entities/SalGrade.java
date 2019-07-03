package com.jpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salgrade")
public class SalGrade {
	@Id
	@Column(name="grade")
	private float grade;
	@Column(name="losal")
	private float losal;
	@Column(name="hisal")
	private float hisal;
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public float getLosal() {
		return losal;
	}
	public void setLosal(float losal) {
		this.losal = losal;
	}
	public float getHisal() {
		return hisal;
	}
	public void setHisal(float hisal) {
		this.hisal = hisal;
	}
	
	public String toString() {
		return grade+" "+losal+" "+hisal;
	}
}
