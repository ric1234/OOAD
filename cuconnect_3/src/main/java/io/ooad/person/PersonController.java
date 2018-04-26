package io.ooad.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	// By default this is GET
	@RequestMapping("/persons")
	public List<Person> getAllTopics() {
		return personService.getAllPerson();
	}
	
	//By default this is GET
	@RequestMapping("/persons/{id}")
	public Person getTopic(@PathVariable String id) {
		
		return personService.getPerson(id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST, value="/persons")
	public void addTopic(@RequestBody Person topic) {
		personService.addPerson(topic);
	}
	
	//PUT (UPDATES)
	@RequestMapping(method=RequestMethod.PUT, value="/persons/{id}")
	public void updateTopic(@RequestBody Person topic, @PathVariable String id) {
		personService.updatePerson(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/persons/{id}")
	public void deleteTopic(@PathVariable String id) {
		
		personService.deletePerson(id);
	}

}
