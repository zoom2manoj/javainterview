package com.duplicate;

public class SecondLagestNumber {
	
	private void secondLargest(int arr[]){
		
		int maxOne=arr[0];
		int maxTwo=arr[1];
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]>maxOne){
				
				maxTwo=maxOne;
				maxOne=arr[i];
			}else if (arr[i]>maxTwo) {
				
				maxTwo=arr[i];
			}
			
		}
		
		System.out.println(maxOne);
		System.out.println(maxTwo);
	}
	
	
	public static void main(String...s){
		
		new SecondLagestNumber().secondLargest(new int[]{4,8,2,555,3,10,100,4,5,99});
	}
	
}
