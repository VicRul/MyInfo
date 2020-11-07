package org.vicrul.myinfo.service;

import java.util.List;

import org.vicrul.myinfo.domain.User;

public interface UserService {

	User findUser(int id);
	List<User> saveUser(User user);
}
