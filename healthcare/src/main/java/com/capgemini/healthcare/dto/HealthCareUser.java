package com.capgemini.healthcare.dto;

import java.util.ArrayList;
import java.util.List;

public class HealthCareUser {
	String userId;
	String userPassword;
	String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public List<HealthCareDiagnosticCenter> getCenterList() {
		return centerList;
	}

	public void setCenterList(List<HealthCareDiagnosticCenter> centerList) {
		this.centerList = centerList;
	}

	long contactNumber;
	String email;
	String userRole;
	List<HealthCareDiagnosticCenter> centerList = new ArrayList<HealthCareDiagnosticCenter>();

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName
				+ ", contactNumber=" + contactNumber + ", email=" + email + ", userRole=" + userRole + ", centerList="
				+ centerList + "]";
	}

}
