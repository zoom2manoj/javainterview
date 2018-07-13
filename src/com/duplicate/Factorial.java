package com.duplicate;

//5*4*3*2*1
public class Factorial {

	public int fact(int number){
		
		int result = 1;
		
		while(number!=0){
			
		result=result*number;
		number--;
		
		}
		
		return result;
		
	}
	
	public static void main(String...s){
		
		System.out.println(new Factorial().fact(5));
	}
	
}
