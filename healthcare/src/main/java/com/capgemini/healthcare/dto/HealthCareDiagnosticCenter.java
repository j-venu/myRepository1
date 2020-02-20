package com.capgemini.healthcare.dto;

import java.util.ArrayList;
import java.util.List;

public class HealthCareDiagnosticCenter {
	public HealthCareDiagnosticCenter(String centername, String centerid) {
		super();
		this.centername = centername;
		this.centerid = centerid;
	}

	List<HealthCareTest> listOfTests = new ArrayList<HealthCareTest>();
	List<HealthCareAppointment> appointmentList = new ArrayList<HealthCareAppointment>();

	public HealthCareDiagnosticCenter(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " centerid=" + centerid +" centername=" + centername  ;
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

	String centername;
	String centerid;

	public String getCentername() {
		return centername;
	}

	public void setCentername(String centername) {
		this.centername = centername;
	}

	public String getCenterid() {
		return centerid;
	}

	public void setCenterid(String centerid) {
		this.centerid = centerid;
	}

}