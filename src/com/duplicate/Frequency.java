package com.duplicate;

import java.util.Map;
import java.util.TreeMap;

public class Frequency {

	public void getFrequencyffromNumber(){
		
		int n=1112245;
		int freq[]=new int[10];
		
		  	System.out.println("Output:");
	        System.out.println("====================");
	        System.out.println("Digit\tFrequency");
	        System.out.println("====================");
	        int rem;
	        while(n!=0)
	        {
	        	rem=n%10; 
	            freq[rem]++; 
	            n=n/10;
	        }
	        for(int i=0; i<10; i++)
	            {
	                if(freq[i]!=0)
	                    System.out.println("   "+i+"\t    "+freq[i]);
	            }
	}
	
	public void getFrequencyFromArray(){
		
		int arr[]={12,14,12,16,14,8,12,8,8,8,8,8,8,8,8};
		
		int freq[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				
				if(arr[i]==arr[j]){
					
					freq[i]++;
				}
			}
		}
		
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++){
			
			map.put(arr[i], freq[i]);
//			System.out.println(arr[i]+" = = "+freq[i]);
		}
		
		System.out.println(map);
		
	}
	
	public static void main(String args[]){
		
//		new Frequency().getFrequencyffromNumber();
		new Frequency().getFrequencyFromArray();

	}
	
	
}
