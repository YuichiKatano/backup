package com.internousdev.travel.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.travel.dao.LoginConfirmDAO;
import com.internousdev.travel.dto.LoginConfirmDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginConfirmAction extends ActionSupport implements SessionAware {

	private String username;
	private String password;
	private List<LoginConfirmDTO> loginConfirmDTOList=new ArrayList<LoginConfirmDTO>();
	public Map<String, Object>session;

	public String execute(){
		String ret=ERROR;
		System.out.println(username);
		System.out.println(password);
		LoginConfirmDAO dao=new LoginConfirmDAO();

		loginConfirmDTOList=dao.select(username, password);
		if(this.username.equals(loginConfirmDTOList.get(0).getUsername())
				&& this.password.equals(loginConfirmDTOList.get(0).getPassword())){
			ret=SUCCESS;

			// JSPで使う値をセット
			// idもsession.putしましょう。 user_master_id
			session.put("user_master_id", loginConfirmDTOList.get(0).getId());
			session.put("username", loginConfirmDTOList.get(0).getUsername());

	}else{
		ret=ERROR;
	}

		return ret;
	}

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

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object>session){
		this.session=session;
	}

}
