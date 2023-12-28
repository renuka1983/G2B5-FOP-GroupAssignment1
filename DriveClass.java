package com.gl.fopassignment;

public class DriveClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepartment hr = new HrDepartment();
		AdminDepartment admin = new AdminDepartment();
		TechDepartment tech = new TechDepartment();
		
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWordDeadline());
		System.out.println(hr.isTodayAHoldiay());
		
		System.out.println();
		
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWordDeadline());
		System.out.println(hr.isTodayAHoldiay());
		
		System.out.println();
		
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWordDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(hr.isTodayAHoldiay());
		
	}
}


