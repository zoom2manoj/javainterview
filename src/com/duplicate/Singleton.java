package com.duplicate;

public class Singleton {

	String name;
	int salary;
	
	private static Singleton mSingleton;
	
	private Singleton(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	
	public  void getAccess(){
		
		System.out.println("Hoorray!!!! Its working");
	}
	
	public static Singleton getObject(){
		
		if(mSingleton==null){
			
			mSingleton=new Singleton("Lalu",101);
			
			return mSingleton;
			
		}else {
			
			
			return mSingleton;
			
		}
		
		
		
		
	}
	
public static void main(String...s){
		
		Singleton mSingleton=Singleton.getObject(	);
		mSingleton.getAccess();
		System.out.println(mSingleton.name);
		System.out.println(mSingleton.salary);
		
		
	}
}


