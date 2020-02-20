package com.capgemini.healthcare.dao;

import java.time.LocalDate;
import java.util.List;

import com.capgemini.healthcare.dto.HealthCareDiagnosticCenter;
import com.capgemini.healthcare.dto.HealthCareTest;
import com.capgemini.healthcare.dto.HealthCareUser;

public interface IHealthCareDAO {
public boolean addcenter(HealthCareDiagnosticCenter d);
public boolean removecenter(HealthCareDiagnosticCenter d);
//public String addTest(HealthCareTest t);
//public boolean removeTest(HealthCareTest t);
//public boolean approveAppointment();
//public String makeAppointment(HealthCareUser u,HealthCareDiagnosticCenter d,HealthCareTest t,LocalDate l);
//public String registerUser(HealthCareUser u);
//public List utility();
}
