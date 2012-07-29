package com.kaledou.applicationservice.service.usersystem;

import java.util.List;

import com.kaledou.domainobject.domain.entity.usersystem.User;

public interface CommunicationService {
	
	public List<User> searchUserByName(String name, Long enquirer_id, int start, int max);
	
	public List<User> searchUserByTag(List<Long> tag_id, Long enquirer_id, int start, int max);
	
	public List<User> searchUserByNamePrompt(String name);
	
	public User getUserBasicInfoByUId(Long u_id);
	
	public boolean followUserOrNot(Long target_id, Long enquirer_id, boolean wantFollowOrNot);


}
