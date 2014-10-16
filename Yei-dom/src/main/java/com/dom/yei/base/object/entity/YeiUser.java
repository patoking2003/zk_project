package com.dom.yei.base.object.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the yei_user database table.
 * 
 */
@Entity
@Table(name="yei_user")
public class YeiUser implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3596549220309551343L;

	@Id
	@Column(name="yei_user_id")
	private Integer yeiUserId;
	
	private String name;

	private String password;

	private String username;


	public YeiUser() {
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getYeiUserId() {
		return this.yeiUserId;
	}

	public void setYeiUserId(Integer yeiUserId) {
		this.yeiUserId = yeiUserId;
	}

}