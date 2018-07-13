package com.practise;


public class HackerMan {
	
	
	private int getOutput(String number){
		
		String[] splited = number.split("\\s+");
		
		int firstNumber=Integer.parseInt(splited[0]);
		
		int secondNumber=Integer.parseInt(splited[1]);
		
		int firstReverse=	reverseNumber(firstNumber);
		
		int secondReverse=reverseNumber(secondNumber);
		
		int sumNumber=firstReverse+secondReverse;
		
		return reverseNumber(sumNumber);
		
	}
	

	private int reverseNumber(int  number){
		
		   int reverse = 0;
		   
	        while(number != 0){
	        	
	            reverse = (reverse*10)+(number%10);
	            number = number/10;
	            
	        }
	        
		return reverse;
	}
	
	   
		
	public static void main(String...s){
		
		//According to the sample Input
		System.out.println(new HackerMan().getOutput("4358 754"));;
		
		//output= 1998
	}
	
}
