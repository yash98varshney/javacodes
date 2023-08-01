package com.in28min.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

//custom error details structure
//We want this structure as a response

public class ErrorDetails {


	
	private LocalDate timestamp;
	private String error;
	private String details;
	
	public ErrorDetails(LocalDate timestamp, String error, String details) {
		super();
		this.timestamp = timestamp;
		this.error = error;
		this.details = details;
	}
	
	public LocalDate getTimestamp() {
		return timestamp;
	}

	public String getError() {
		return error;
	}

	public String getDetails() {
		return details;
	}


	
	
	
	
}
