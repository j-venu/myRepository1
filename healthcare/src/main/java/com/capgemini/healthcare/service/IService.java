package com.capgemini.healthcare.service;

import java.time.LocalDate;
import java.util.ArrayList;
import com.capgemini.healthcare.dto.*;
import com.capgemini.healthcare.dto.HealthCareDiagnosticCenter;
import com.capgemini.healthcare.dto.HealthCareTest;
import com.capgemini.healthcare.dto.HealthCareUser;

public interface IService {
	ArrayList<HealthCareDiagnosticCenter> centerlist = new ArrayList();

	public boolean addcenter(HealthCareDiagnosticCenter d);

	public boolean removecenter(HealthCareDiagnosticCenter d);

	//public String addTest(HealthCareTest t);

	//public boolean removeTest(HealthCareTest t);

	//public boolean approveAppointment();

	//public String makeAppointment(HealthCareUser u, HealthCareDiagnosticCenter d, HealthCareTest t, LocalDate l);

	//public String registerUser(HealthCareUser u);

}