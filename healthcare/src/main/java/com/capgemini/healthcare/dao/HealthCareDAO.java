package com.capgemini.healthcare.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.healthcare.dto.HealthCareDiagnosticCenter;

public class HealthCareDAO implements IHealthCareDAO {
	List<HealthCareDiagnosticCenter> centerList=new ArrayList<HealthCareDiagnosticCenter>();
	public List<HealthCareDiagnosticCenter> toList() {
		return centerList=utility();
	}
	public List utility() {
		// TODO Auto-generated method stub
		List<HealthCareDiagnosticCenter>list = new ArrayList<HealthCareDiagnosticCenter>();
        
		String centerName = null;
				String centerId = null;
				
				list.add(new HealthCareDiagnosticCenter("Hyd","101"));
				list.add(new HealthCareDiagnosticCenter("secundrabad","102"));
				list.add(new HealthCareDiagnosticCenter("kukatpally","103"));
				list.add(new HealthCareDiagnosticCenter("jbs","104"));
				
		return list;
	}
	@Override
	public boolean addcenter(HealthCareDiagnosticCenter diagnostic) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removecenter(HealthCareDiagnosticCenter diagnostic) {
		// TODO Auto-generated method stub
		if(centerList.remove(diagnostic))
			return true;
		else
			return false;
	}


}
