package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.mapper.BonusMapper;
import com.springjdbc.model.Bonus;

@Repository
public class BonusDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Bonus> findAll(){
		return jdbcTemplate.query("select * from bonus",new BonusMapper());
	}
	
}
