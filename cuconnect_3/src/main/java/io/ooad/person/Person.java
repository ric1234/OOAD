package io.ooad.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	private String username;
	private String id;
	private String name;
	private String description;		
	private String firstName;
	private String lastName;
	private int age;
	private String password;
	//private ArrayList<String> friends = new ArrayList<String>(Arrays.asList("jay","nick","dave","adam"));
	public ArrayList<String> friends =  new ArrayList<String>();
	private String status ="status I hate java";
	private String feeling = "feeling elated";
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}

	
	
	public Person() {
	
		  
	}
	
	public Person( String id,String name, String description, String username, String firstname, String lastname, String password, int age ) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.age = age;
		this.username = username;
		this.firstName = firstname;
		this.lastName = lastname;
		this.password = password;
		this.friends = new ArrayList<String>();
		
//		this.friends = new ArrayList<String>(Arrays.asList("jay","nick","dave","adam"));
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	//new
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<String> getFriends() {
		return friends;
	}

	public void setFriends(ArrayList<String> friends) {
		this.friends = friends;
	}
	
	
	
	
	
	

}
