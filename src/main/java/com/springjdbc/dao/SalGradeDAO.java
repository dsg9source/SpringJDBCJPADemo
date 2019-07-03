package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.model.SalGrade;

@Repository
public class SalGradeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<SalGrade> findAll(){
		return jdbcTemplate.query("select * from salgrade",new BeanPropertyRowMapper<SalGrade>(SalGrade.class));
	}
	
	
}
