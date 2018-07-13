package com.practise;

import java.util.Arrays;

public class Anagrams {

	
	public static String isAnagram(String twoWords) {
		
		String[] splited = twoWords.split("\\s+");
		
		String firstWord=splited[0];
		String secondWord=splited[1];
		
	     char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     
	     if (Arrays.equals(word1, word2)) {
			return "YES";
		}
	     
	     return "NO";
	}
	
	public static void main(String...s){
		
		System.out.println(isAnagram("abcd bcdae"));;
	}
	
}
