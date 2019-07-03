package com.springjdbc.model;

public class SalGrade {
	private float grade;
	private float losal;
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
