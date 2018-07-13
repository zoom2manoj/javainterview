package com.practise;

import java.util.ArrayList;
import java.util.List;

interface Employee{
	
	void showEmployeeDetails();
}


class Engineer implements Employee{

	String name;
	int id;
	
	 Engineer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public void showEmployeeDetails() {
		
		System.out.println(name + " " +id);
	}
	
}

class Accountant implements Employee{

	String name;
	int id;
	
	 Accountant(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public void showEmployeeDetails() {
		System.out.println(name + " " +id);
	}
}


class CompanyDirectory implements Employee{

	List<Employee> mList=new ArrayList<Employee>();
	
	public void addEmployee(Employee emp){
		
		mList.add(emp);
	}
	
	@Override
	public void showEmployeeDetails() {
		
		for(int i=0;i<mList.size();i++){
			
			mList.get(i).showEmployeeDetails();
		}
	}
	
	
}

public class CompositePattern {

	public static void main(String...s)
	{
		Engineer mEngineer1=new Engineer("Lalu", 101);
		Engineer mEngineer2=new Engineer("Rabri", 102);
		
		CompanyDirectory mDirectory1=new CompanyDirectory();
		mDirectory1.addEmployee(mEngineer1);
		mDirectory1.addEmployee(mEngineer2);
		
		Accountant mAccountant1=new Accountant("SRK", 103);
		Accountant mAccountant2=new Accountant("Sallu", 104);
		
		CompanyDirectory mDirectory2=new CompanyDirectory();
		mDirectory2.addEmployee(mAccountant1);
		mDirectory2.addEmployee(mAccountant2);
		
		CompanyDirectory mDirectory=new CompanyDirectory();
		mDirectory.addEmployee(mDirectory1);
		mDirectory.addEmployee(mDirectory2);
		
		mDirectory.showEmployeeDetails();
		
	}

	
	
}
