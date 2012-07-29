package com.kaledou.domainobject.domain.entity.usersystem;

/**
 * 
 * @author WWJ
 * 
 */
public abstract class FollowUserRelationship {

	protected User follower;
	protected User beFollowed;

	public User getFollower() {
		return follower;
	}

	public void setFollower(User follower) {
		this.follower = follower;
	}

	public User getBeFollowed() {
		return beFollowed;
	}

	public void setBeFollowed(User beFollowed) {
		this.beFollowed = beFollowed;
	}

}
