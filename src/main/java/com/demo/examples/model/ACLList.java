package com.demo.examples.model;

import java.util.List;

public class ACLList {

	String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public List<String> getDocIdStr() {
		return docIdStr;
	}

	public void setDocIdStr(List<String> docIdStr) {
		this.docIdStr = docIdStr;
	}

	List<String> docIdStr;
}
