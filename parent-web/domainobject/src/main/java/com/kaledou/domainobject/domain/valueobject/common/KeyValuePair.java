package com.kaledou.domainobject.domain.valueobject.common;

import com.kaledou.domainobject.domain.constant.SearchItemType;

public class KeyValuePair {

	private String key;
	private Object value;
	private KeyValuePair[] child;
	private SearchItemType type;

	public String getKey() {
		return key;
	}

	public Object getValue() {
		return value;
	}

	public SearchItemType getType() {
		return type;
	}

	public KeyValuePair[] getChild() {
		return child;
	}

	public KeyValuePair(String key, Object value, SearchItemType type) {
		this.key = key;
		this.value = value;
		this.type = type;
	}
	
	public KeyValuePair(KeyValuePair[] child) {
		this.type = SearchItemType.OR;
		this.child = child;
	}

}
