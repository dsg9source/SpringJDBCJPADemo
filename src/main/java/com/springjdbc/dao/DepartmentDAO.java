package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.mapper.DepartmentMapper;
import com.springjdbc.model.Department;

@Repository
public class DepartmentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Department> findAll(){
		return jdbcTemplate.query("select * from dept", new DepartmentMapper());
	}
	
	public Department findByDeptNo(int deptNo) {
		try {
		return jdbcTemplate.queryForObject("select * from dept where deptno=?",new Object[] {deptNo},new DepartmentMapper());
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
	
}

