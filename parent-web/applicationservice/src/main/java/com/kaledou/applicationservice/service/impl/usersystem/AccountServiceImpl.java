package com.kaledou.applicationservice.service.impl.usersystem;

import com.kaledou.applicationservice.service.usersystem.AccountService;
import com.kaledou.domainobject.domain.repository.UserRepository;

public class AccountServiceImpl implements AccountService {

	@SuppressWarnings("rawtypes")
	private UserRepository userRepository;

	@Override
	public boolean checkEmailExist(String email, Long u_id) {
		return userRepository.countUserByEmail(email, u_id) == 0 ? true : false;
	}

	@Override
	public boolean checkNicknameExist(String nickname, Long u_id) {
		return userRepository.countUserByEmail(nickname, u_id) == 0 ? true
				: false;
	}

	public void setUserRepository(
			@SuppressWarnings("rawtypes") UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
