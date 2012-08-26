package com.kaledou.webjar.action.usersystem;

import com.kaledou.applicationservice.service.usersystem.AccountService;
import com.kaledou.domainobject.domain.entity.usersystem.User;
import com.kaledou.webjar.action.common.BaseAction;
import com.kaledou.webjar.constant.ReturnCode;

public class AccountAction extends BaseAction {

	/**
     *
     */
	private static final long serialVersionUID = 504038255740997294L;
	private String email;
	private String nickname;
	private String password;

	private AccountService accountService;
	
	public String login() {
		
		return null;
	}

	public String logff() {
		session.clear();
		return SUCCESS;
	}

	public String localRegister() {
		return null;
	}
	
	public String checkEmailExist() {
		User user = (User) session.get("user");
		if(accountService.checkEmailExist(email, user.getU_id())) {
			this.buildOk(null);
		} else {
			this.buildError(ReturnCode.CONFLICT, "");
		}
		return SUCCESS;
	}
	
	public String checkNicknameExist() {
		User user = (User) session.get("user");
		if(accountService.checkNicknameExist(nickname, user.getU_id())) {
			this.buildOk(null);
		} else {
			this.buildError(ReturnCode.CONFLICT, "");
		}
		return SUCCESS;
	}

	// Renren weibo qq
	public String apiRegister() {
		return null;
	}

	private String register() {
		return null;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}

}