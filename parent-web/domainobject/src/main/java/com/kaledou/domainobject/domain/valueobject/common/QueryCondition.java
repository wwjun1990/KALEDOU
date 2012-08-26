package com.kaledou.domainobject.domain.valueobject.common;

import java.util.ArrayList;
import java.util.List;

import com.kaledou.domainobject.domain.constant.SearchItemType;

public class QueryCondition {

	private List<KeyValuePair> queryCondition;

	public QueryCondition() {
		queryCondition = new ArrayList<KeyValuePair>();
	}

	public void addQueryCondition(String key, Object value, SearchItemType type) {
		queryCondition.add(new KeyValuePair(key, value, type));
	}

	public void addQueryCondition(String[] keys, Object[] values,
			SearchItemType[] types) {
		if (keys.length == values.length && values.length == types.length) {
			KeyValuePair[] pairs = new KeyValuePair[keys.length];
			for (int i = 0; i < keys.length; i++) {
				pairs[i] = new KeyValuePair(keys[i], values[i], types[i]);
			}
			queryCondition.add(new KeyValuePair(pairs));
		}
	}

}
