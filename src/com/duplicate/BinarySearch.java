package com.duplicate;

public class BinarySearch {

	private static boolean isPresent(int arr[],int number){
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end){
			
		int mid=(start+end)/2; 		
		
		if(arr[mid]==number){
			
			System.out.println(mid);
			return true;
		}else {
			
			if(number>arr[mid]){
				
				start=mid+1;
				
			}else {
				end=mid-1;
			}
		}
		
	}
		return false;
	}
	
	public static void main(String...s){
		
System.out.println(isPresent(new int[]{4,6,8,9,13,16,25}, 25));		;
		
		}
	
}
