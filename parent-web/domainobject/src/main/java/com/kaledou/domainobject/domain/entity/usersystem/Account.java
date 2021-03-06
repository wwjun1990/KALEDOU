package com.kaledou.domainobject.domain.entity.usersystem;

/**
 * 
 * @author WWJ
 * 
 */
public abstract class Account {

	protected Long u_id;
	protected String email;
	protected String password;

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
