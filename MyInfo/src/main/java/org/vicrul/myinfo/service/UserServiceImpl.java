package org.vicrul.myinfo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.vicrul.myinfo.domain.User;
import org.vicrul.myinfo.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	@Override
	public User findUser(int id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> saveUser(User user) {
		userRepository.save(user);
		return userRepository.findAll();
	}

}
