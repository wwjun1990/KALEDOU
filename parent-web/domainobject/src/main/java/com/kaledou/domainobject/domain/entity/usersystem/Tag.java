package com.kaledou.domainobject.domain.entity.usersystem;

/**
 * 
 * @author WWJ
 * 
 */
public abstract class Tag {

	protected Long tag_id;
	protected String tagName;

	public Long getTag_id() {
		return tag_id;
	}

	public void setTag_id(Long tag_id) {
		this.tag_id = tag_id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

}
