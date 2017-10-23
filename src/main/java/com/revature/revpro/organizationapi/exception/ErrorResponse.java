package com.revature.revpro.organizationapi.exception;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ErrorResponse {

	private Integer errorCode;
	
	private String message;
}
