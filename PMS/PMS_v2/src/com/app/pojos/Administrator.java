package com.app.pojos;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@NamedQuery(name="Administrator.findAll", query="SELECT a FROM Administrator a")
public class Administrator implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String email;
	private String name;
	private String password;
	private String phoneNumber;
	private String role;

	public Administrator() {
	}


	public Administrator(String email, String name, String password,
			String phoneNumber, String role) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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


	@Column(name="phone_number")
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Administrator [id=" + id + ", email=" + email + ", name="
				+ name + ", password=" + password + ", phoneNumber="
				+ phoneNumber + ", role=" + role + "]";
	}

}