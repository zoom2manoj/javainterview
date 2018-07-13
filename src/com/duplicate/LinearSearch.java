package com.duplicate;

public class LinearSearch {
		
	private boolean isPresent(int arr[],int number){
		
		for(int i=0;i<arr.length;i++){
			
			if(number==arr[i]){
				
				System.out.println(number+" is present at index "+i);
				return true;
			}
		}
		
		System.out.println(number+" is not present");
		return false;
		
	}
	
	public static void main(String...s){
		
		new LinearSearch().isPresent(new int[]{4,3,6,7,5},7);
		
	}
}
