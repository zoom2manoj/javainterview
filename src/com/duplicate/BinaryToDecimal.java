package com.duplicate;

public class BinaryToDecimal {

	private int getDecimal(int binary){
		
		
		if(checkbinary(binary)){
			
			int decimal=0;
			int power=0;
			
			while(binary!=0){
				
				int rem =binary%10;
				decimal=(int) (decimal+rem*Math.pow(2, power));
				
				binary=binary/10;
				
				power++;
			}
			return decimal;
			
		}else {
			System.out.println("Invalid binary number");
			return binary;
		}
		
		
	
	}
	
	
	private	boolean checkbinary(int number){
		
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
		
		System.out.println(new BinaryToDecimal().getDecimal(1001));;
	}
}
