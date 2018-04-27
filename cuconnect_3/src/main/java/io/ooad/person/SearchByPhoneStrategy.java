package io.ooad.person;

public class SearchByPhoneStrategy implements SearchFriendsStrategy{
	private String m_phone;
	public SearchByPhoneStrategy(String entered_phone) {
		this.m_phone = entered_phone;
	}
	@Override
	public void searchUser() {
		System.out.println(m_phone);
	}
}
