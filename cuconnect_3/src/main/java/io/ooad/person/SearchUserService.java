package io.ooad.person;

import org.springframework.stereotype.Service;

@Service
public class SearchUserService {
	public Person searchUserFriend(SearchFriendsStrategy searchMethod, PersonService personService){
		return searchMethod.searchUser(personService);
	}
}
