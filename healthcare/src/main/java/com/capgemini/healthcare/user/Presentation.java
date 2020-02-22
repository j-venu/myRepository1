package com.capgemini.healthcare.user;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.healthcare.dao.HealthCareDAO;
import com.capgemini.healthcare.dto.HealthCareDiagnosticCenter;
import com.capgemini.healthcare.service.IService;
import com.capgemini.healthcare.service.Service;


public class Presentation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		IService service = new Service();
		HealthCareDAO dao = new HealthCareDAO();
		//HealthCareDiagnosticCenter center = new HealthCareDiagnosticCenter(Integer.toString(rand.nextInt(1000)));
		
		
		System.out.println("Available Centers");
		
		List<HealthCareDiagnosticCenter> list=dao.toList();
		
		for (HealthCareDiagnosticCenter healthCareDiagnosticCenter : list) {
			System.out.println(healthCareDiagnosticCenter);
		}
		
		System.out.println("Select a centerId ");
		String str=sc.next();
		sc.nextLine();
		
		
		boolean flag=false;
		boolean bool=false;
		for (HealthCareDiagnosticCenter healthCareDiagnosticCenter : list) {
			
			if(healthCareDiagnosticCenter.getCenterId().equals(str))
			{
				bool=dao.removecenter(healthCareDiagnosticCenter);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Entered id does not exist");
		
		if(bool) {
		System.out.println("Centers after removing");
	
			for (HealthCareDiagnosticCenter healthCareDiagnosticCenter : list) {
				System.out.println(healthCareDiagnosticCenter);
			}
		}
	}
	}



