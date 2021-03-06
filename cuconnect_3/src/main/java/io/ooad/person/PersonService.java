package io.ooad.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList( 
//			new Topic("blah", "bhahah","sresfds"),
//			new Topic("awesome","aykote","shavam")			
//			
//			));
	public List<Person> getAllPerson(){
//		return topics;
		List<Person> persons = new ArrayList<>();
		personRepository.findAll()
		.forEach(persons::add);
		return persons;
	}
	
	public List<Person> showAllPersons(){
		List<Person> persons = new ArrayList<Person>();
		for(Person person : personRepository.findAll()) {
			persons.add(person);
		}
		
		return persons;
	}
	
	public Person getPerson(String id) {
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return personRepository.findOne(id);
		
	}
	public Person getPersonByUsername(String username) {
//		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return personRepository.findOne(username);
		
	}
	
	
	public void addPerson(Person person) {
//		topics.add(topic);
		personRepository.save(person);
	}
	
	public void updatePerson(String id, Person topic) {
//		for(int i=0; i< topics.size();i++) {
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		
		personRepository.save(topic);
	}

	public void deletePerson(String id) {
		// TODO Auto-generated method stub
//		topics.removeIf(t->t.getId().equals(id));
		personRepository.delete(id);
	}
	
	public Person findByUsernameAndPassword(String username, String password) {
		return personRepository.findByUsernameAndPassword(username, password);
	}
	
	public Person findByUsername(String username) {
		return personRepository.findByUsername(username);
	}
	
	public Person findByEmail(String email) {
		return personRepository.findByEmail(email);
	}
	
	public Person findByPhone(String phone) {
		return personRepository.findByPhone(phone);
	}
	

	public Object showAllfriends() {
		
		return null;
	}

}
