package io.ooad.person;

import org.springframework.beans.factory.annotation.Autowired;

public class SearchByPhoneStrategy implements SearchFriendsStrategy{
	private String m_phone;
	@Autowired
	private PersonService p;
	public SearchByPhoneStrategy(String entered_phone) {
		this.m_phone = entered_phone;
	}
	@Override
	public Person searchUser(PersonService personService) {
		return p.findByEmail(m_phone);
	}
}
