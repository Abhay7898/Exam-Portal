package com.exam.model;

import lombok.Data;

@Data
public class JwtResponse {

	String token;

	public JwtResponse(String token) {
		super();
		this.token = token;
	}
	
	
}
