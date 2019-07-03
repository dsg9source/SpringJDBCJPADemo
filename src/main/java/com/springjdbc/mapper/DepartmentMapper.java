package com.springjdbc.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.model.Department;

public class DepartmentMapper implements RowMapper<Department> {

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department dept=new Department();
		dept.setDepartmentNo(rs.getInt("deptno"));
		dept.setDepartmentName(rs.getString("dname"));
		dept.setLocation(rs.getString("loc"));
		
		return dept;
	}

}
