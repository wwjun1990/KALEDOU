package com.kaledou.applicationservice.service.impl.usersystem;

import java.util.List;

import com.kaledou.applicationservice.service.usersystem.CommunicationService;
import com.kaledou.domainobject.domain.entity.usersystem.User;
import com.kaledou.domainobject.domain.repository.UserRepository;
import com.kaledou.domainobject.domain.service.SearchUserRule;
import com.kaledou.domainobject.domain.valueobject.common.QueryCondition;

public class CommunicationServiceImpl implements CommunicationService{
	
	@SuppressWarnings("rawtypes")
	private UserRepository userRepository;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> searchUserByName(String name, Long enquirer_id,
			int start, int max) {
		QueryCondition condition = SearchUserRule.generateSearchUserRule(userRepository, enquirer_id);
		return userRepository.searchUserByName(name, condition);
	}

	@Override
	public List<User> searchUserByTag(List<Long> tag_id, Long enquirer_id,
			int start, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> searchUserByNamePrompt(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserBasicInfoByUId(Long u_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean followUserOrNot(Long target_id, Long enquirer_id,
			boolean wantFollowOrNot) {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("rawtypes")
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
