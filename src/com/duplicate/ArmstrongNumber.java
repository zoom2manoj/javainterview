package com.duplicate;
//371
public class ArmstrongNumber {

	public boolean isArmstong(int number){
		
		int sum=0;
		int count=0;
		int rem=0;
		int firstNumber=number;
		
		count=String.valueOf(number).length();
		
		while(number>0){
			rem=number%10;
			sum=(int) (sum+Math.pow(rem, count));
			number=number/10;
		}
		
		if(sum==firstNumber){
			
			return true;
		}
		
		
		return false;
		
	}
	
	public static void main(String...s){
		
		System.out.println(new ArmstrongNumber().isArmstong(371));;
	}
	
}
