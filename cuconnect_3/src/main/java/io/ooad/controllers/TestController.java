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
import io.ooad.person.SearchUserService;
import io.ooad.person.SearchByEmailStrategy;
import io.ooad.person.SearchByUsernameStrategy;
import io.ooad.person.SearchByPhoneStrategy;

@Controller
public class TestController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private SearchUserService searchUserService;
	
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

	@RequestMapping ("/login-user-richard")
	public String loginUser(@ModelAttribute Person person, HttpServletRequest request) {
		
		if(personService.findByUsernameAndPassword(person.getUsername(), person.getPassword())!=null) {
			return "searchfriendpage";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomePage";
			
		}
	}

	
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute Person person, HttpServletRequest request) {
		
		if(personService.findByUsernameAndPassword(person.getUsername(), person.getPassword())!=null) {
			
			request.setAttribute("name", person.getUsername());
			request.setAttribute("friends", person.getFriends());
			request.setAttribute("content", person.getStatus());
			request.setAttribute("emotion", person.getFeeling());
			return "homepage";
	}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomePage";
			
		}
	}

	@RequestMapping ("/possible_friend_match")
	public String lookForFriend(@ModelAttribute Person person, HttpServletRequest request) {
		//searchUserService.searchUserFriend(new SearchByEmailStrategy(enteredString));
		Person temp_person =searchUserService.searchUserFriend(new SearchByUsernameStrategy(person.getUsername(), personService), personService);
		request.setAttribute("persons", temp_person);
		//searchUserService.searchUserFriend(new SearchByPhoneStrategy(enteredString));
		return "friend_results";

	
	
	@PostMapping("/add-friend")
	public String addFriend(@ModelAttribute Person person,BindingResult bindingResult, HttpServletRequest request) {
		Person person_search = personService.getPerson(person.getUsername());
		person_search.friends.add(person.getUsername());
		personService.addPerson(person_search);			
		request.setAttribute("friends", person_search.getFriends());		
		request.setAttribute("mode", "MODE_FRIENDS");
		return "homepage";

	}

}
