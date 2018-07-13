package com.duplicate;

public class PowerOfTwo {

	private boolean isPower(int number){

		int mul=1;
		while (number>=mul) {
			
			if(mul==number){
				
				return true;
			}
			
			mul=mul*3;
		}
		
		 
	        return false;
		
	}
	
    private  boolean isPowerOfTwo(int number) {
        if(number <=0){
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            return true;
        }
        return false;
    }


	public static void main(String...s){

		System.out.println(new PowerOfTwo().isPower(9));;
	}
}
