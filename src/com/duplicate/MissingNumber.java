package com.duplicate;

public class MissingNumber {

	public int getMissingNo(int a[]){
		
			int n=a.length;
			int i, total;
		    total  = (n+1)*(n+2)/2;
		    for ( i = 0; i< n; i++){
		    	
		    	 total = total-a[i];
		    }
		    	
		    return total;
	}
	
	   public static void main(String[] args) {
		   
		   System.out.println(new MissingNumber().getMissingNo(new int[]{10,9,3,6,4,7,8,1,2}));
		   
	   }
}
