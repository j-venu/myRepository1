package com.capgemini.healthcare.dto;

import java.util.ArrayList;
import java.util.List;

public class HealthCareDiagnosticCenter {
	public HealthCareDiagnosticCenter(String centerName, String centerId) {
		super();
		this.centerName = centerName;
		this.centerId = centerId;
	}

	List<HealthCareTest> listOfTests = new ArrayList<HealthCareTest>();
	List<HealthCareAppointment> appointmentList = new ArrayList<HealthCareAppointment>();

	public HealthCareDiagnosticCenter(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " centerId=" + centerId +" centerName=" + centerName  ;
	}

	public List<HealthCareTest> getListOfTests() {
		return listOfTests;
	}

	public void setListOfTests(List<HealthCareTest> listOfTests) {
		this.listOfTests = listOfTests;
	}

	public List<HealthCareAppointment> getAppointmentList() {
		return appointmentList;
	}

	public void setAppointmentList(List<HealthCareAppointment> appointmentList) {
		this.appointmentList = appointmentList;
	}

	String centerName;
	String centerId;

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterId() {
		return centerId;
	}
}