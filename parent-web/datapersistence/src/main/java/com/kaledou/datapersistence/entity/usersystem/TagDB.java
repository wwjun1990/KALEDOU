package com.kaledou.datapersistence.entity.usersystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.kaledou.domainobject.domain.entity.usersystem.Tag;

/**
 * 
 * @author WWJ
 * 
 */

@Entity
@Table(name = "KALEDOU_US_TAG")
public class TagDB extends Tag{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TAG_ID")
	@Override
	public Long getTag_id() {
		return super.getTag_id();
	}

	@Override
	public void setTag_id(Long tag_id) {
		super.setTag_id(tag_id);
	}

	@Column(name = "TAG_NAME", nullable = false)
	@Override
	public String getTagName() {
		return super.getTagName();
	}

	@Override
	public void setTagName(String tagName) {
		super.setTagName(tagName);
	}


}
