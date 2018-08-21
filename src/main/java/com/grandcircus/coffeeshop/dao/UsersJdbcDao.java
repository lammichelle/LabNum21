package com.grandcircus.coffeeshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.grandcircus.coffeeshop.entity.Users;

@Repository
public class UsersJdbcDao {
	//we need to use JdbcTemplate to execute a query
		@Autowired //use Spring to autowire it
		JdbcTemplate jdbcTemplate;
		
		public List<Users> findAll(){
			return jdbcTemplate.query("select * from Users", new BeanPropertyRowMapper<Users>(Users.class));
		}
		
		public int insertUser(String firstName, String lastName, String email, String phone, String password, String confirmPassword) {
			String insertQuery = "INSERT INTO users(firstName, lastName, email, phone, password, confirmPassword)"
					+ "values(?,?,?,?,?,?)";
			return jdbcTemplate.update(insertQuery, firstName, lastName, email, phone, password, confirmPassword);
		}
	
	
	
	
	

}
