package com.kaledou.datapersistence.entity.usersystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kaledou.domainobject.domain.entity.usersystem.Account;

/**
 * 
 * @author WWJ
 * 
 */

@Entity
@Table(name = "KALEDOU_US_ACCOUNT")
public class AccountDB extends Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "U_ID")
	@Override
	public Long getU_id() {
		return super.getU_id();
	}

    @Override
	public void setU_id(Long u_id) {
		super.setU_id(u_id);
	}

	@Column(name = "USERNAME", nullable = false)
	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Override
	public void setUsername(String username) {
		super.setUsername(username);
	}

	@Column(name = "PASSWORD", nullable = false)
	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public void setPassword(String password) {
		super.setPassword(password);
	}

}
