package com.grandcircus.coffeeshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.grandcircus.coffeeshop.dao.ItemsJdbcDao;
import com.grandcircus.coffeeshop.dao.UsersJdbcDao;

@Controller
public class HomeController {
	
	@Autowired 
	ItemsJdbcDao itemsDao;
	
	@Autowired
	UsersJdbcDao usersDao;
	
	@RequestMapping("/") //this is the url
	public ModelAndView indexPage() {
		return new ModelAndView("index", "items", itemsDao.findAll());
	}
	
	@RequestMapping("/register") //url
	public String registerPage() {
		return "register"; //string methods in the controller class return the view 
	}
	
	@RequestMapping("/additem") //url is mostly lower case
	public ModelAndView formData(@RequestParam("firstName")String fName) {
		return new ModelAndView("additem", "personName", fName);
	}
	
	@RequestMapping("/adduser") //url is mostly lower case
	public String addUser() {
		return "adduser"; 
	}
	
	@RequestMapping("/addnewuser")
	public ModelAndView addNew(@RequestParam("firstName")String firstName, @RequestParam("lastName")String lastName,
			@RequestParam("email")String email,@RequestParam("phone")String phone, @RequestParam("password")String password, 
			@RequestParam("confirmPassword")String confirmPassword){
		
		
		usersDao.insertUser(firstName, lastName, email, phone, password, confirmPassword);
		return new ModelAndView("additem", "personName", firstName);
	}
	
}
