package io.ooad.person;

import org.springframework.stereotype.Service;

@Service
public class SearchUserService {
	public void searchUserFriend(SearchFriendsStrategy searchMethod){
		searchMethod.searchUser();
	}
}
