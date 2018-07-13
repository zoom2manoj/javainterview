package com.duplicate;

public class NumberSum {
	
	   int sum = 0;
	private int getSum(int number){
		
		if(number==0){
			
			return sum;
		}
		else {
		sum=sum+(number%10);
		getSum(number/10);
		}
		
	return sum;	
	}

	     
	
	 public static void main(String a[]){
		 
		 System.out.println(new NumberSum().getSum(23));;
		 
	    }
	
}
