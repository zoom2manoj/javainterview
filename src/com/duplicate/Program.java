package com.duplicate;

interface My{
	
	void show();
}


abstract class Base{
	
	 void show(){
		 System.out.println("base");
	 }
}

public class Program extends Base implements My{

	
	public static void main(String...s){
		int result=0;
	      for(int i=100;i<=200;i++){
	           if(i%7==0)
	              result+=i;
	      }
	      System.out.println("Output of Program is : "+result);
		new Program().show();
	}

	@Override
public 	void show() {
		
		System.out.println("Show");
	}
	
}
