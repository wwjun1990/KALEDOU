package com.kaledou.webjar.action.common;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.kaledou.webjar.constant.ReturnCode;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 562580371279795808L;
	
	protected Map<String, Object> session;
	protected int code;
	protected Object msg;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getCode() {
		return code;
	}

	public Object getMsg() {
		return msg;
	}
	
	protected void buildOk(Object msg) {
		this.code = ReturnCode.OK;
		this.msg = msg;
	}
	
	protected void buildError(int code, Object msg) {
		this.code = code;
		this.msg = msg;
	}

}
