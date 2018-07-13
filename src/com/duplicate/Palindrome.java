package com.duplicate;

public class Palindrome {

	private boolean isPalindrome(int number){
		int rev = 0;
		int checkReverese=number;
		while(number!=0){
			
			rev=(rev*10)+(number%10);
			number=number/10;
		}
		
		if(rev==checkReverese){
			
			return true;
		}
		
		return false;
		
	}
	
	
	private boolean checkStringPalindrome(String string){
		
		String revString="";
		char []arr=string.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--){
			
			revString=revString+arr[i];
		}
		
		if(revString.equals(string)){
			return true;
		}
		
		
		return false;
	}
	
public static void main(String...s){

	System.out.println(new Palindrome().isPalindrome(1221));;
	System.out.println(new Palindrome().checkStringPalindrome("aabbaa"));
}
}
