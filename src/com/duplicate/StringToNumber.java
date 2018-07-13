package com.duplicate;

public class StringToNumber {

	private int parseInt(String number){
		
		int zeroAscii=(int)'0';
		int sum=0;
		
		char arr[]=number.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			
			int charAscii=(int)arr[i];
			
			sum=(sum*10)+(charAscii-zeroAscii);
		}
		
		return sum;
		
	}
	
public static void main(String...s){
		
	System.out.println(new StringToNumber().parseInt("3252"));;
}
}