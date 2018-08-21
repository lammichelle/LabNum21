package com.grandcircus.coffeeshop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.grandcircus.coffeeshop.entity.Items;

@Repository
public class ItemsJdbcDao {
	//we need to use JdbcTemplate to execute a query
			@Autowired //use Spring to autowire it
			JdbcTemplate jdbcTemplate;
			
			public List<Items> findAll(){
				return jdbcTemplate.query("select * from Items", new BeanPropertyRowMapper<Items>(Items.class));
			}

}
