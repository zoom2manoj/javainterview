package com.duplicate;

public class ReverseNumber {

	private int reverseNumber(int number){
		
		   int reverse = 0;
		   int count=0;
	        while(number != 0){
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	            count++;
	        }
		System.out.println(count);
		return reverse;
	}
	
		
	public static void main(String...s){
		
		
		System.out.println(new ReverseNumber().reverseNumber(123456789));;
	}
	
}
