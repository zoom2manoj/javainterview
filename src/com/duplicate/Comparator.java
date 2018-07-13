package com.duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Driver{

	String name;
	int age;
	int rollNo;
	
	 Driver(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
	}
}


class AgeComparator implements java.util.Comparator<Driver>{

	@Override
	public int compare(Driver o1, Driver o2) {
		
		if(o1.age==o2.age)  
			
			return 0;  
			else if(o1.age>o2.age)  
			return 1;  
			else  
			return -1;  
		
			}
	}
	
class NameComparator implements java.util.Comparator<Driver>{

	@Override
	public int compare(Driver o1, Driver o2) {
		return o1.name.compareTo(o2.name);  
	}
	
}

public class Comparator {

	public static void main(String args[]){  
		
		ArrayList<Driver> mArrayList=new ArrayList<Driver>();
		mArrayList.add(new Driver("Deepak", 101, 27));
		mArrayList.add(new Driver("Shyam", 102, 25));
		mArrayList.add(new Driver("Gajendra", 102, 32));
		
		
		System.out.println("sorting by age...");  
		Collections.sort(mArrayList,new AgeComparator());
		
		Iterator< Driver> mIterator=mArrayList.iterator();
		while (mIterator.hasNext()) {
			
			Driver driver = (Driver) mIterator.next();
			
			System.out.println(driver.name+" "+driver.rollNo+" "+driver.age);
			
		}
		
		
		System.out.println("Sorting by Name...");  
		
		Collections.sort(mArrayList,new NameComparator());
		
		Iterator< Driver> mIterator1=mArrayList.iterator();
		while (mIterator1.hasNext()) {
			
			Driver driver = (Driver) mIterator1.next();
			
			System.out.println(driver.name+" "+driver.rollNo+" "+driver.age);
			
		}
		
		}  
	
}
