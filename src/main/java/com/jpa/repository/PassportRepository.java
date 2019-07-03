package com.jpa.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.entities.Passport;

@Repository
@Transactional
public class PassportRepository {

	@Autowired
	EntityManager em;
	
	public void savePassportInfo(Passport passport) {
		 em.persist(passport);
		 
	}
}
