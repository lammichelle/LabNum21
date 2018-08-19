package com.grandcircus.coffeeshop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/") //this is the url
	public ModelAndView indexPage() {
		return new ModelAndView("index", "register", "Welcome to GC COFFEE!");
	}
	
	@RequestMapping("/register") //url
	public String registerPage() {
		return "register"; //string methods in the controller class return the view 
	}
	
	@RequestMapping("/adduser") //url is mostly lower case
	public ModelAndView formData(@RequestParam("firstName")String fName) {
		return new ModelAndView("adduser", "personName", fName);
	}
	
	@RequestMapping("/additem") //url is mostly lower case
	public String addItem() {
		return "additem"; 
	}
	
	
}
