package com.internousdev.travel.dto;

public class LoginConfirmDTO {

	// private String idを作ってください
	private String id;
	private String username;
	private String password;

	public String getUsername(){
		return username;
	}

	public void setUsername(String username){
		this.username=username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getId(){
		return id;
	}

	public void setId(String id){
		this.id=id;
	}

	// idのgetter setter メソッドを作ってください。
}