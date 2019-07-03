package com.springjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springjdbc.mapper.EmployeeMapper;
import com.springjdbc.model.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Employee> findAll() {
		return jdbcTemplate.query("select * from emp", new EmployeeMapper());
	}

	public Employee findByID(int employeeId) {
		try {
			return jdbcTemplate.queryForObject("select * from emp where empno=?", new Object[] { employeeId },
					new EmployeeMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public int insertEmployee(Employee emp) {
		try {
			return jdbcTemplate.update(
					"insert into emp (empno,ename,job,mgr,hiredate,sal,comm,deptno) values (?,?,?,?,?,?,?,?)",
					new Object[] { emp.getEmployeeId(), emp.getEmployeeName(), emp.getJob(), emp.getMgr(),
							emp.getHireDate(), emp.getSal(), emp.getComm(), emp.getDeptNo() });
		} catch (DataAccessException e) {
			throw new ArithmeticException("this is due to invalid data like number(4) but input is 12222222222222222");// should
																														// throw
																														// app
																														// specific
																														// exception
		}
	}

	public int updateEmployeeNameById(String name, int id) {
		try {
			return jdbcTemplate.update("update emp set ename=? where empno=?", new Object[] { name, id });
		} catch (DataAccessException e) {
			throw new ArithmeticException();// should throw app specific exception
		}
	}

	public int deleteEmployeeByID(int id) {
		return jdbcTemplate.update("delete from emp where empno=?", new Object[] { id });
	}

}
