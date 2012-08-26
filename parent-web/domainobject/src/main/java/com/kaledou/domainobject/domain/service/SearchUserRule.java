package com.kaledou.domainobject.domain.service;

import com.kaledou.domainobject.domain.repository.UserRepository;
import com.kaledou.domainobject.domain.valueobject.common.QueryCondition;

public class SearchUserRule {

	public static QueryCondition generateSearchUserRule(
			UserRepository userRepository, Long enquirer_id) {
		QueryCondition condition = new QueryCondition();
		
		return condition;
	}

}
