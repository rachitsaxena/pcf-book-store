package com.rachit.bookstore.service.order.proxy.profile;

import java.util.List;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class User {
	
	private Long id;
	private String firstName;
	private String lastName;
	private UserType userType;
	
	private List<Address> addresses;
	private String email;
	private Boolean isActive;

	public User() {
	}

	public User(String firstName, String lastName, UserType userType, List<Address> addresses, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userType = userType;
		this.addresses = addresses;
		this.email = email;
		this.isActive = Boolean.TRUE;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Enumerated(EnumType.ORDINAL)
	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getIsActive() {
		return isActive;
	}
	
	public void setIsActive(Boolean active) {
		this.isActive = active;
	}
	
}
