package com.duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student>{
	
	String name;
	int rollNo;
	int age;
	
	public Student(String name, int rollNo, int age) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		
		if(this.age==o.age){
			return 0;
		}else if (this.age<o.age) {
			return -1;
		}else {
			return 1;
		}
	}
	
}

public class ComparableInterface {
	
	public static void main(String args[]){  
		
		ArrayList<Student> mArrayList=new ArrayList<Student>();
		mArrayList.add(new Student("Deepak", 101, 27));
		mArrayList.add(new Student("Shyam", 102, 25));
		mArrayList.add(new Student("Gajendra", 102, 32));
		
		Collections.sort(mArrayList);
		
		Iterator< Student> mIterator=mArrayList.iterator();
		while (mIterator.hasNext()) {
			
			Student student = (Student) mIterator.next();
			
			System.out.println(student.name+" "+student.rollNo+" "+student.age);
			
		}
		
		}  
}
