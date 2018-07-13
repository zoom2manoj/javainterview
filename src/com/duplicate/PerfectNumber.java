package com.duplicate;

public class PerfectNumber {

	//1+2+3=6
	private boolean isPerfect(int number){
		
		int sum=0;
		
		for(int i=1;i<number;i++){
			
			if(number%i==0){
				
				sum=sum + i;
			}
			
		}
		if(sum==number){
			
			 System.out.println("It is a perfect number");
	            return true;
		}else {
			 System.out.println("It is not a perfect number");
	            return false;
		}
	}
	  public static void main(String a[]){
		  PerfectNumber ipn = new PerfectNumber();
	        System.out.println(ipn.isPerfect(6));
	    }
}
