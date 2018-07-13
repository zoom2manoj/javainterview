package com.duplicate;

public class Swapping {

	 public static void main(String a[]){
	        int x = 20;
	        int y = 40;
	        System.out.println("Before swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        x=x+y;
	        y=x-y;
	        x=x-y;
	        System.out.println("After swap:");
	        System.out.println("x value: "+x);
	        System.out.println("y value: "+y);
	        
	        int price = 6;
	    	switch (price) {
	    		case 2: System.out.println("It is: 2");
	    		default: System.out.println("It is: default");
	    		case 5: System.out.println("It is: 5");
	    		case 9: System.out.println("It is: 9");
	    		
	    		
	    	}
	    }
}
