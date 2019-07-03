package com.springjdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.model.Bonus;

public class BonusMapper implements RowMapper<Bonus> {

	@Override
	public Bonus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bonus bonus = new Bonus();
		bonus.setEmployeeName(rs.getString("ename"));
		bonus.setJob(rs.getString("job"));
		bonus.setSal(rs.getFloat("sal"));
		bonus.setComm(rs.getFloat("comm"));
		
		 return bonus;

	}

}
