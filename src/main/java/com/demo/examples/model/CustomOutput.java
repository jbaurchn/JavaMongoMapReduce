package com.demo.examples.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Document
@JsonInclude(Include.NON_NULL)
public class CustomOutput {
	 @Id private String id;
	 private Value value;

	  public String getId() {
	    return id;
	  }

	 

	  public Value getValue() {
		return value;
	}



	public void setValue(Value value) {
		this.value = value;
	}



	public void setId(String id) {
		this.id = id;
	}



	@Override
	  public String toString() {
	    return "ValueObject [id=" + id + ", value=" + value + "]";
	  }
}
