package com.duplicate;

public class CalculateLengthString {

	public int length(String s){
		
		int count = 0;
		
		char arr[]=s.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			
			count++;
			
		}
		
		return count;
		
	}
	
	public static void main(String...s){
		
		System.out.println(new CalculateLengthString().length("Deepak"));;
	}
}
