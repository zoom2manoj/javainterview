package com.duplicate;

import java.util.HashMap;

public class FirstNonRepeatedCharacter {
//Without Java API
	private char getFirst(String s){
		
		char arr[]=s.toCharArray();
		
		int freq[]=new int[s.length()];
		
		for(int i=0;i<s.length();i++){
			
			for(int j=0;j<s.length();j++){
				
				if(arr[i]==arr[j]){
					freq[i]++;
				}
				
			}
		}
		
		for(int i=0;i<freq.length;i++){
			
			if(freq[i]==1){
				
				return s.charAt(i);
			}
			
		}
		return 0;
	}
	
	//With Collection API
	 public  Character firstNonRepeatedCharacter(String str)
	 
	    {
		 
		 HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		 
		 for(int i=0;i<str.length();i++){
			 
			 char c=str.charAt(i);
			 
			 if(map.containsKey(c)){
				 
				 map.put(c, map.get(c)+1);
			 }else {
				map.put(c, 1);
			}
			 
		 }
		 
		 for(int i=0;i<str.length();i++){
			 
			 if(map.get(str.charAt(i))==1){
				 
				 return str.charAt(i);
			 }
		 }
		 
		 
		 
			return null;
	        

	    }
	 
	 
	public static void main(String...s){
		
		System.out.println(new FirstNonRepeatedCharacter().getFirst("Alive is awesome"));
	}
}
