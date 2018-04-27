package io.ooad.person;

import org.springframework.beans.factory.annotation.Autowired;

public class SearchByEmailStrategy implements SearchFriendsStrategy{
	private String m_email;
	@Autowired
	private PersonService p;
	public SearchByEmailStrategy(String entered_email) {
		this.m_email = entered_email;
	}
	@Override
	public Person searchUser(PersonService personService) {
		return p.findByEmail(m_email);
	}
}
