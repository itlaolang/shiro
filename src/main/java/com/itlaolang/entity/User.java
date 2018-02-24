/**
 * 
 */
package com.itlaolang.entity;

/**
 * @author itlaolang
 * @date 2018年2月24日 
 * @version：v 1.0 
 * @Description：用户实体类
 */
public class User {

	public String name;//姓名
	
	public String password;//密码

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
