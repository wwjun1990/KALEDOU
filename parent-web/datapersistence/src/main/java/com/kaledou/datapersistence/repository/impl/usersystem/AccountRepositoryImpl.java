package com.kaledou.datapersistence.repository.impl.usersystem;

import com.kaledou.datapersistence.entity.usersystem.AccountDB;
import com.kaledou.domainobject.domain.entity.usersystem.Account;
import com.kaledou.domainobject.domain.repository.AccountRepository;


public class AccountRepositoryImpl extends
		BaseRepositoryImpl<AccountDB, Account> implements AccountRepository<AccountDB> {

}
