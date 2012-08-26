package com.kaledou.datapersistence.entity.usersystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author WWJ
 * 
 */

@Entity
@Table(name = "KALEDOU_US_FOLLOWUSERRELATIONSHIP")
public class FollowUserRelationshipDB {

	private Long id;
	private UserDB follower;
	private UserDB beFollowed;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FUR_ID")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FOLLOWER_UID")
	public UserDB getFollower() {
		return follower;
	}

	public void setFollower(UserDB follower) {
		this.follower = follower;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BEFOLLOWER_UID")
	public UserDB getBeFollowed() {
		return beFollowed;
	}

	public void setBeFollowed(UserDB beFollowed) {
		this.beFollowed = beFollowed;
	}

}
