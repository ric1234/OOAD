package io.ooad.person;

public class SearchByEmailStrategy implements SearchFriendsStrategy{
	private String m_email;
	public SearchByEmailStrategy(String entered_email) {
		this.m_email = entered_email;
	}
	@Override
	public void searchUser() {
		System.out.println(m_email);
	}
}
