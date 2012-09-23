package com.kaledou.datapersistence.entity.usersystem;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.kaledou.domainobject.domain.entity.usersystem.User;

/**
 * 
 * @author WWJ
 * 
 */

@Entity
@Table(name = "KALEDOU_US_USER")
public class UserDB extends User<UserInfoDB, AccountDB> {

	private List<FollowUserRelationshipDB> followerRelationship;
	private List<FollowUserRelationshipDB> beFollowedRelationship;
	
	@Id
	@Column(name = "U_ID")
    @GeneratedValue(generator="foreigner")
    @GenericGenerator(name="foreigner",strategy="foreign",parameters={
                       @Parameter(name = "property",value="account")
    })
	@Override
	public Long getU_id() {
		return super.getU_id();
	}

	@Override
	public void setU_id(Long u_id) {
		super.setU_id(u_id);
	}

	@Column(name = "NICKNAME", nullable = false)
	@Override
	public String getNickname() {
		return super.getNickname();
	}

	@Override
	public void setNickname(String nickname) {
		super.setNickname(nickname);
	}

	@Column(name = "NICKNAMEPINYIN", nullable = false)
	@Override
	public String getNicknamePinYin() {
		return super.getNicknamePinYin();
	}

	@Override
	public void setNicknamePinYin(String nicknamePinYin) {
		super.setNicknamePinYin(nicknamePinYin);
	}

	@OneToOne(mappedBy = "user")
	@Override
	public UserInfoDB getUserInfo() {
		return super.getUserInfo();
	}

	@Override
	public void setUserInfo(UserInfoDB userInfo) {
		super.setUserInfo(userInfo);
	}

	@OneToMany(mappedBy = "follower")
	public List<FollowUserRelationshipDB> getFollowerRelationship() {
		return followerRelationship;
	}

	@Transient
	@Override
	public List<User> getFollowUser() {
		return super.getFollowUser();
	}

	@Override
	public void setFollowUser(List<User> followUser) {
		super.setFollowUser(followUser);
	}

	@Transient
	@Override
	public List<User> getBeFollowedUser() {
		return super.getBeFollowedUser();
	}

	@Override
	public void setBeFollowedUser(List<User> beFollowedUser) {
		super.setBeFollowedUser(beFollowedUser);
	}

	public void setFollowerRelationship(
			List<FollowUserRelationshipDB> followerRelationship) {
		this.followerRelationship = followerRelationship;
	}

	@OneToMany(mappedBy = "beFollowed")
	public List<FollowUserRelationshipDB> getBeFollowedRelationship() {
		return beFollowedRelationship;
	}

	public void setBeFollowedRelationship(
			List<FollowUserRelationshipDB> beFollowedRelationship) {
		this.beFollowedRelationship = beFollowedRelationship;
	}

	@Column(name = "TAGNAMESPICED")
	@Override
	public String getTagName() {
		return super.getTagName();
	}

	@Override
	public void setTagName(String tagName) {
		super.setTagName(tagName);
	}

	@PrimaryKeyJoinColumn
	@OneToOne
	@Override
	public AccountDB getAccount() {
		return super.getAccount();
	}

	@Override
	public void setAccount(AccountDB account) {
		super.setAccount(account);
	}

}
