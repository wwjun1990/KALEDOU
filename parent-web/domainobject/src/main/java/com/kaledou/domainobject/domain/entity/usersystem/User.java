package com.kaledou.domainobject.domain.entity.usersystem;

import java.util.List;

/**
 * 
 * @author WWJ
 * 
 */
public abstract class User<U extends UserInfo, A extends Account> {

	protected Long u_id;
	protected String nickname;
	protected String nicknamePinYin;
	protected U userInfo;
	protected List<User> followUser;
	protected List<User> beFollowedUser;
	protected String tagName;
	protected A account;

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getNicknamePinYin() {
		return nicknamePinYin;
	}

	public void setNicknamePinYin(String nicknamePinYin) {
		this.nicknamePinYin = nicknamePinYin;
	}

	public U getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(U userInfo) {
		this.userInfo = userInfo;
	}

	public List<User> getFollowUser() {
		return followUser;
	}

	public void setFollowUser(List<User> followUser) {
		this.followUser = followUser;
	}

	public List<User> getBeFollowedUser() {
		return beFollowedUser;
	}

	public void setBeFollowedUser(List<User> beFollowedUser) {
		this.beFollowedUser = beFollowedUser;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public A getAccount() {
		return account;
	}

	public void setAccount(A account) {
		this.account = account;
	}

}
