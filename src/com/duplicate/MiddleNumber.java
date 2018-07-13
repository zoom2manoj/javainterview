package com.duplicate;

public class MiddleNumber {
	
	int a=12;
	int b=34;
	int c=89;
	int middle;
	
	private int getMiddle(){
	
		if (a > b) {
			
			  if (b> c) {
				  
			    return b;
			    
			  } else if (a > c)
				  
			  {
			    return c;
			    
			  } else {
				  
			    return a;
			    
			  }
			  
			} 
		
		else {
			  
			if (a > c) {
			    return a;
			    
			  } else if (b > c) {
				  
			    return c;
			    
			  } else {
				  
			    return b;
			    
			  }
			
			}
		
		
	}
	
	
	public static void main(String...s){
		
		int a=3;
		int b=1;
		int c=2;
		int middle;
		
		if(a>b){
			
			if(a<c){
				
				middle=a;
			}else {
				middle=b;
			}
			
		}else if (b<c) {
			
			middle=b;
			
		}else if(a<c){
			
			middle=c;
			
		}else {
			
			middle=a;
		}
	
	
	
	
	
	
	
	
	System.out.println(new MiddleNumber().getMiddle());;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
