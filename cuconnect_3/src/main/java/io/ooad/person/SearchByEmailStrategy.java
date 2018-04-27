package io.ooad.person;

import org.springframework.beans.factory.annotation.Autowired;

public class SearchByEmailStrategy implements SearchFriendsStrategy{
	private String m_email;
	public SearchByEmailStrategy(String entered_email, PersonService personService) {
		this.m_email = entered_email;
	}
	@Override
	public Person searchUser(PersonService personService) {
		return personService.findByEmail(m_email);
	}
}
