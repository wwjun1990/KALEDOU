package com.kaledou.domainobject.domain.entity.admin;

import com.kaledou.domainobject.domain.entity.usersystem.Account;

public class Admin {
	
	protected Long u_id;
	protected String name;
	protected Account account;

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
