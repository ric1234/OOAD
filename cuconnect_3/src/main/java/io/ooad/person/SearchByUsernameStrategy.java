package io.ooad.person;

public class SearchByUsernameStrategy implements SearchFriendsStrategy {
	private String m_username;
	public SearchByUsernameStrategy(String entered_username) {
		this.m_username = entered_username;
	}
	@Override
	public void searchUser() {
		System.out.println(m_username);
	}
}
