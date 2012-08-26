package com.kaledou.applicationservice.service.usersystem;

public interface AccountService {
	
	public boolean checkEmailExist(String email, Long u_id);
	
	public boolean checkNicknameExist(String nickname, Long u_id);

}
