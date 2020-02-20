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
		
		
		System.out.println("Centers before removing");
		
		List<HealthCareDiagnosticCenter> l=dao.toList();
		
		for (HealthCareDiagnosticCenter healthCareDiagnosticCenter : l) {
			System.out.println(healthCareDiagnosticCenter);
		}
		
		System.out.println("Select a center id");
		String s=sc.next();
		sc.nextLine();
		
		
		boolean flag=false;
		boolean b=false;
		for (HealthCareDiagnosticCenter healthCareDiagnosticCenter : l) {
			
			if(healthCareDiagnosticCenter.getCenterid().equals(s))
			{
				b=dao.removecenter(healthCareDiagnosticCenter);
				flag=true;
				break;
			}
		}
		if(flag==false)
			System.out.println("Entered id does not exist");
		
		if(b) {
		System.out.println("Centers after removing");
	
			for (HealthCareDiagnosticCenter healthCareDiagnosticCenter : l) {
				System.out.println(healthCareDiagnosticCenter);
			}
		}
	}
	}






