package io.ooad.person;

import org.springframework.beans.factory.annotation.Autowired;

public class SearchByPhoneStrategy implements SearchFriendsStrategy{
	private String m_phone;
	public SearchByPhoneStrategy(String entered_phone, PersonService personService) {
		this.m_phone = entered_phone;
	}
	@Override
	public Person searchUser(PersonService personService) {
		return personService.findByEmail(m_phone);
	}
}
