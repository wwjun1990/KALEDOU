package com.kaledou.datapersistence.repository.impl.usersystem;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.kaledou.datapersistence.entity.usersystem.UserDB;
import com.kaledou.domainobject.domain.entity.usersystem.User;
import com.kaledou.domainobject.domain.repository.UserRepository;
import com.kaledou.domainobject.domain.valueobject.common.QueryCondition;

public class UserRepositoryImpl extends BaseRepositoryImpl<UserDB, User>
		implements UserRepository<UserDB> {
	

	@Override
	public int countUserByEmail(String email, Long u_id) {
		DetachedCriteria criteria = DetachedCriteria.forClass(UserDB.class);
		criteria.createCriteria("account");
		criteria.add(Restrictions.eq("account.email", email));
		if(u_id != null) {
			criteria.add(Restrictions.ne("u_id", u_id));
		}
		return countByCriteria(criteria);
	}

	@Override
	public int countUserByNickname(String nickname, Long u_id) {
		DetachedCriteria criteria = DetachedCriteria.forClass(UserDB.class);
		criteria.add(Restrictions.eq("nickname", nickname));
		if(u_id != null) {
			criteria.add(Restrictions.ne("u_id", u_id));
		}
		return countByCriteria(criteria);
	}

	@Override
	public List<User> searchUserByName(String name, QueryCondition condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
