package com.duplicate;

public class BinaryOrNot {

	private boolean isBinary(int number){
		
		while (number!=0) {
			
		int rem=number%10;
		
		if(rem>1){
			
			return false;
		}
		
		number=number/10;
		
		}
		
		return true;
		
	}
	
public static void main(String...s){
		
		System.out.println(new BinaryOrNot().isBinary(011));
	}
}
