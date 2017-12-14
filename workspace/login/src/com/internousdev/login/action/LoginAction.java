/**
 *
 */
package com.internousdev.login.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class LoginAction extends ActionSupport {

	private String username;
	private String password;

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            セットする username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		String ret = ERROR;
		if (username.equals("taro")) {
			if (password.equals("123")) {
				ret = SUCCESS;
			}
		}
		return ret;
	}

}
