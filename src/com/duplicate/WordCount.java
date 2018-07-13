package com.duplicate;

public class WordCount {

	private int calculateWords(String s){
		
		int count=0;
		
		if(s.charAt(0)!=' '){
			
			count++;
			
		}else if (s.charAt(0)==' ') {
			
			return count;
		}
		
		for(int i=1;i<s.length();i++){
				if((s.trim().charAt(i)==' ' && s.charAt(i+1)!=' ')  || (s.trim().charAt(i)==',' && s.charAt(i+1)!=',')){
					
					count++;
				}
					
		}
		
		return count;
	}
	
	
	public static void main(String...s){
		
		
		System.out.println(new WordCount().calculateWords(""));
	}
	
}
