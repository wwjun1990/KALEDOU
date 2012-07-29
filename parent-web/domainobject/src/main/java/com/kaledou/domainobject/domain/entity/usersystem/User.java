package com.kaledou.domainobject.domain.entity.usersystem;

import java.util.List;

/**
 * 
 * @author WWJ
 * 
 */
public abstract class User {

	protected Long u_id;
	protected String name;
	protected String namePinYin;
	protected UserInfo userInfo;
	protected List<FollowUserRelationship> followerRelationship;
	protected List<FollowUserRelationship> beFollowedRelationship;
	protected String tagName;
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

	public String getNamePinYin() {
		return namePinYin;
	}

	public void setNamePinYin(String namePinYin) {
		this.namePinYin = namePinYin;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<FollowUserRelationship> getFollowerRelationship() {
		return followerRelationship;
	}

	public void setFollowerRelationship(
			List<FollowUserRelationship> followerRelationship) {
		this.followerRelationship = followerRelationship;
	}

	public List<FollowUserRelationship> getBeFollowedRelationship() {
		return beFollowedRelationship;
	}

	public void setBeFollowedRelationship(
			List<FollowUserRelationship> beFollowedRelationship) {
		this.beFollowedRelationship = beFollowedRelationship;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
