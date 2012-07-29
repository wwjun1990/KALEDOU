package com.kaledou.webjar.action.usersystem;

import com.kaledou.applicationservice.service.usersystem.UserService;
import com.kaledou.webjar.action.common.BaseAction;

public class CommunicationAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9006758219602973303L;
	
	private String name;
	private String tag_id;
	private Long u_id;
	private UserService userService;

	public String searchUserByName() {
		
		return null;
	}
	
	public String searchUserByTag() {
		return null;
	}

	public String ajaxSearchUserByNamePrompt() {
		return null;
	}

	public String ajaxfollowUser() {
		return null;
	}

	public String ajaxcancelFollowUser() {
		return null;
	}

	public String ajaxGetUserBasicInfo() {
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTag_id(String tag_id) {
		this.tag_id = tag_id;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}