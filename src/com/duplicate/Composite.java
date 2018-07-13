/*Singleton
Factory
Decorator
Fascade
Composite*/

package com.duplicate;

import java.util.ArrayList;
import java.util.List;

interface Employee {
	
	  void showEmployeeDetails();
}

class Engineer implements Employee
{

	String name;
	int id;
	
	public Engineer(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void showEmployeeDetails() {
		
		System.out.println("Name= "+name+" id= "+id);
		
	}
	
}

class Accountant implements Employee{
	
	String name;
	int id;
	
	public Accountant(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println("Name= "+name+" id= "+id);
	}
	
}

class CompanyDirectory implements Employee{
	
	List<Employee> mEmployees=new ArrayList<Employee>();
	
	  public void addEmployee(Employee emp){
		  mEmployees.add(emp);
	    }
	
	  public void removeEmployee(Employee emp){
		  mEmployees.remove(emp);
	    }
	
	@Override
	public void showEmployeeDetails() {
		
		for(int i=0;i<mEmployees.size();i++){
			
			mEmployees.get(i).showEmployeeDetails();
		}
	}
	
}

public class Composite {

	public static void main(String...s){
		
		Engineer mEngineer1= new Engineer("Lalu",101);
		Engineer mEngineer2=new Engineer("Rabri",102);
		
		CompanyDirectory mDirectoryEngineer=new CompanyDirectory();
		mDirectoryEngineer.addEmployee(mEngineer1);
		mDirectoryEngineer.addEmployee(mEngineer2);
		
		Accountant mAccountant1=new Accountant("SRK",103 );
		Accountant mAccountant2=new Accountant("Sallu", 104);
		
		CompanyDirectory mDirectoryAccountant=new CompanyDirectory();
		mDirectoryAccountant.addEmployee(mAccountant1);
		mDirectoryAccountant.addEmployee(mAccountant2);
		
		 CompanyDirectory directory = new CompanyDirectory();
	        directory.addEmployee(mDirectoryEngineer);
	        directory.addEmployee(mDirectoryAccountant);
	        directory.showEmployeeDetails();
		
		
	}
	
}
