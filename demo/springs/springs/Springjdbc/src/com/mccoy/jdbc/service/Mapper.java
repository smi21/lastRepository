package com.mccoy.jdbc.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mccoy.jdbc.dto.Registerdto;

public class Mapper implements RowMapper<Registerdto> {

	@Override
	public Registerdto mapRow(ResultSet rs, int rownum) throws SQLException {
		Registerdto registerdto=new Registerdto();
		registerdto.setId(rs.getInt("id"));
		registerdto.setName(rs.getString("name"));
		registerdto.setEmailid(rs.getString("emailid"));
		registerdto.setPassword(rs.getString("password"));
		return registerdto;
	}

}
