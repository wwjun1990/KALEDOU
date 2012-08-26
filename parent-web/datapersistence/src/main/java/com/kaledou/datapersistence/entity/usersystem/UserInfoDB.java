package com.kaledou.datapersistence.entity.usersystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.kaledou.domainobject.domain.entity.usersystem.UserInfo;

/**
 * 
 * @author WWJ
 * 
 */

@Entity
@Table(name = "KALEDOU_US_USERINFO")
public class UserInfoDB extends UserInfo {

	private UserDB user;

	@Id
	@Column(name = "U_ID")
	@GeneratedValue(generator = "foreigner")
	@GenericGenerator(name = "foreigner", strategy = "foreign", parameters = { @Parameter(name = "property", value = "user") })
	@Override
	public Long getU_id() {
		return super.getU_id();
	}

	@Override
	public void setU_id(Long u_id) {
		super.setU_id(u_id);
	}

	@Column(name = "GENDER")
	@Override
	public Boolean getGender() {
		return super.getGender();
	}

	@Override
	public void setGender(Boolean gender) {
		super.setGender(gender);
	}

	@Column(name = "BIRTHDATE")
	@Override
	public String getBirthDate() {
		return super.getBirthDate();
	}

	@Override
	public void setBirthDate(String birthDate) {
		super.setBirthDate(birthDate);
	}

	@PrimaryKeyJoinColumn
	@OneToOne
	public UserDB getUser() {
		return user;
	}

	public void setUser(UserDB user) {
		this.user = user;
	}

}
