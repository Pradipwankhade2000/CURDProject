package com.usercurd2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	public List<UserClass> getUserDetails() {
		return userRepository.findAll();
	}


	public void saveUser(UserClass userclass) {
		userRepository.save(userclass);
	}

	public UserClass edituser(Integer userid) {
		return userRepository.findById(userid).get();
	}


	public void deleteUser(Integer userid) {
		userRepository.deleteById(userid);
	}
}
