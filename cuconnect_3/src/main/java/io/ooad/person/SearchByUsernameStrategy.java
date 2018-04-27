package io.ooad.person;


public class SearchByUsernameStrategy implements SearchFriendsStrategy {
	private String m_username;
	public SearchByUsernameStrategy(String entered_username, PersonService personService) {
		this.m_username = entered_username;
	}
	@Override
	public Person searchUser(PersonService personService) {
		return personService.getPersonByUsername(m_username);
	}
}
