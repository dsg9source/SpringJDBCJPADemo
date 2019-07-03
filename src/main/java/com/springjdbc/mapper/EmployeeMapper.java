package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		emp.setEmployeeId(rs.getInt("empno"));
		emp.setEmployeeName(rs.getString("ename"));
		emp.setJob(rs.getString("job"));
		emp.setMgr(rs.getInt("mgr"));
		emp.setHireDate(rs.getDate("hiredate"));
		emp.setSal(rs.getFloat("sal"));
		emp.setComm(rs.getFloat("comm"));
		emp.setDeptNo(rs.getInt("deptno"));
		
		return emp;
	}

}
