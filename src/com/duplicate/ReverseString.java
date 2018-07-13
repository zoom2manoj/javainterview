package com.duplicate;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	private String reverseString(String s){
		
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--){
			
			reverse=reverse+s.charAt(i);
			
		}
		
		
		return reverse;
	}
	
	private int duplicateCharacter(String s){
		
		List<Character> mCharacters=new ArrayList<Character>() ;
		
		for(int i=0; i<s.length();i++){
			
			mCharacters.add(s.charAt(i));
		}
		
		for(int i=0;i<mCharacters.size();i++){
			
			for(int j=0;j<mCharacters.size();j++){
				
				if(mCharacters.get(i)==mCharacters.get(j)&& i!=j){
					
					System.out.println(mCharacters.get(j));
				}
				
			}
		}
		
		return 10;
	}
	
	public static void main(String...s){
		
		
		System.out.println(new ReverseString().reverseString("kapeed"));;
		new ReverseString().duplicateCharacter("11223366600112");
	}
	
	
}
