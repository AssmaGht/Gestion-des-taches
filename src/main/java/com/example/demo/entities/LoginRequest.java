package com.example.demo.entities;



import com.sun.istack.NotNull;

import lombok.Data;



@Data
public class LoginRequest {

	@NotNull
	private String email;
	@NotNull
	private String password;

}
