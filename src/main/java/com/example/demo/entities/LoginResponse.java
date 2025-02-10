package com.example.demo.entities;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class LoginResponse {

	@NotNull
	private String token;
	@NotNull
	private String type;
	@NotNull
	private String message;
	@NotNull
	private String profil;
	@NotNull
	private String email;
}
