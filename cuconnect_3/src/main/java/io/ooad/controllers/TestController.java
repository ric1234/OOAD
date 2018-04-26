package io.ooad.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.ooad.person.Person;
import io.ooad.person.PersonService;

@Controller
public class TestController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/welcome")
	public String welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcomePage";
	}
	
	@RequestMapping("/register")
	public String registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcomePage";
	}
	
	@PostMapping("/save-user")
	public String registerUser(@ModelAttribute Person person,BindingResult bindingResult, HttpServletRequest request) {
		personService.addPerson(person);
		request.setAttribute("mode", "MODE_HOME");
		return "welcomePage";
	}
	
	@GetMapping("/show-users")
	public String showAllUsers(HttpServletRequest request) {
//		request.setAttribute("persons", personService.getAllPerson());
		request.setAttribute("persons", personService.showAllPersons());
		request.setAttribute("mode", "MODE_ALL_USERS");
		
		return "welcomePage";
	}
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcomePage";
	}
	
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute Person person, HttpServletRequest request) {
		if(personService.findByUsernameAndPassword(person.getUsername(), person.getPassword())!=null) {
			return "homepage";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomePage";
			
		}
	}

}
