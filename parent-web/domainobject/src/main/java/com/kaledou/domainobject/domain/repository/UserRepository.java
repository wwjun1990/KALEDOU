package com.kaledou.domainobject.domain.repository;

import java.util.List;

import com.kaledou.domainobject.domain.entity.usersystem.User;
import com.kaledou.domainobject.domain.valueobject.common.QueryCondition;

public interface UserRepository<E extends User> extends BaseRepository<E, User> {
	
	public int countUserByEmail(String email, Long u_id);
	
	public int countUserByNickname(String nickname, Long u_id);
	
	public List<User> searchUserByName(String name, QueryCondition condition);
	
}
