package com.in28minutes.rest.webservices.restful_web_services.exception;

import java.time.LocalDate;

public class ErrorDetails {

	private LocalDate timestamp;
	private String message;
	private String description;

	public ErrorDetails(LocalDate timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}
}
