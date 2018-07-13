package com.duplicate;

public class PrimeNumber {

	private boolean isprime(int number){
		
		
		for(int i=2;i<number;i++){
			
			if(number%i==0){
				
				return false;
			}	
			
		}
		return true;
	
	}
	
	
	 public static void main(String a[]){
		 PrimeNumber ipn = new PrimeNumber();
	        System.out.println(ipn.isprime(11));
	    }
	
}
