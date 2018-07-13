package com.duplicate;

import java.util.HashMap;

public class FrequencyOfAlphabetsInString {

	private void countfrequency(String s){
		
		char arr[]=s.toCharArray();
		int freq[]=new int[s.length()];
		
		
		for(int i=0;i<arr.length;i++){
			
			for (int j = 0; j < arr.length; j++) {
				
				if(arr[i]==arr[j]){
					
					freq[i]++;
				}
			}
			
		}
		
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<arr.length;i++){
			
			map.put(arr[i], freq[i]);
		}
		
		
		System.out.println(map);
	}
	
		public static void main(String...s){
			
			new FrequencyOfAlphabetsInString().countfrequency("Alive is awesome");
		}
}
