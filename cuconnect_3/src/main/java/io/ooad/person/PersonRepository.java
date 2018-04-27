package io.ooad.person;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String>{

	public Person findByUsernameAndPassword(String username, String password);
	
	public Person findByUsername(String username);
	public Person findByEmail(String email);
	public Person findByPhone(String phone);
	
}
