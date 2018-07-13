package com.duplicate;

public class BubbleSort {

	public static void bubble_sort(int arr[]){
		
		int temp;
		
		for(int m=arr.length;m>=0;m--){
			
			for(int i=0;i<arr.length-1;i++){
				
				if(arr[i]>arr[i+1]){
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static void main(String...s){
		
		bubble_sort(new int[]{15,21,7,5,1,65,25,75,102});
		
	}
}
