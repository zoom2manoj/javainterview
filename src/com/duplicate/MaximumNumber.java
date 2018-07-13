package com.duplicate;

public class MaximumNumber {

	private int getMax(int arr[]){
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]>max){
				
				max=arr[i];
			}
		}
		
		return max;
	}
	
	private int getMin(int arr[]){
		
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++){
			
			if(arr[i]<min){
				
				min=arr[i];
			}
		}
		
		return min;
	}
	public static void main(String...S){
		
	System.out.println("maximum ="+new MaximumNumber().getMax(new int[]{4,8,2,5,3,10,100,4,5}));	
	System.out.println("minimum ="+new MaximumNumber().getMin(new int[]{4,8,2,5,3,10,100,4,5}));
	
	}
	
}
