package com.kaledou.commonutils.common;

public class StringUtils {
	
	public static boolean isEmpty(String str) {
		return null != str && !str.equals("");
	}
	
	public static boolean isNotEmpty(String str) {
		return null == str || str.equals("");
	}

}
