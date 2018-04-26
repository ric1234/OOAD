package io.ooad.person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String>{

	public Person findByUsernameAndPassword(String username, String password);
	
	
	

}
