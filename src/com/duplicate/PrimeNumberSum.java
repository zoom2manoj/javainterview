package com.duplicate;


public class PrimeNumberSum {
	
	
	private static boolean checkPrime(int number)
	{
		
		for(int i=2;i<number;i++){
			
			if(number%i==0){
				
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String...s){
		
		int count=0;
		int number=2;
		int sum=0;
		
		while(count<1000){
			
			if(checkPrime(number)){
				
				sum=sum+number;
				count++;
				
			}
			
			number++;
			
		}
		
		System.out.println(sum);
	}

}
