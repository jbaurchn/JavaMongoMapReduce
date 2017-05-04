package com.demo.examples.model;

import java.util.List;

public class Value {

	List<ACLList> documents;

	public List<ACLList> getDocuments() {
		return documents;
	}

	public void setDocuments(List<ACLList> documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Value [documents=" + documents + "]";
	}
}
