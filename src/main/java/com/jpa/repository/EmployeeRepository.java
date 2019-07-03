package com.jpa.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Employee;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	EntityManager em;
	
	public Employee findById(int id) {
		return em.find(Employee.class, id);
	}
	
	public void deleteById(int id) {
		Employee emp=findById(id);
		em.remove(emp);
	}
	public Employee save(Employee emp) {
		if(0==emp.getEmployeeId()) {
			em.persist(emp);
			return emp;
		}else {
			return em.merge(emp);
		}
	}
	public void findEmpDeptDetails(int id) {
		Employee emp=em.find(Employee.class, id);
		System.out.println(emp);
		System.out.println(emp.getDept());
	}
	
	

}
