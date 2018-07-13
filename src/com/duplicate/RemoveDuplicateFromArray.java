package com.duplicate;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {

	
	public static int[] removeDuplicates(int[] arr) {
		
		int[] whitelist=new int[arr.length];
		int count=0;
		
		HashSet<Integer> mHashSet=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++){
			
			if(mHashSet.add(arr[i])){
				
				whitelist[count++]=arr[i];
			}
		}
		
		
		return Arrays.copyOf(whitelist, count);
	}
	
	
	public static void main(String args[]){
		
	int[] whitelist=removeDuplicates(new int[]{4,6,2,4,2,8,7,5,7,3,4,2});
	
	for (int i = 0; i < whitelist.length; i++) {
		System.out.println(whitelist[i]);
		
	}
	System.out.println("Size== "+whitelist.length);
	}
	
}
