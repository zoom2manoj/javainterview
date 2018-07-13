package com.practise;

public class Middlevariable {

	int a=44;
	int b=79;
	int c=88;
	int middle;
	
	public void get(){
		
		if(a>b){
			
			if(b>c){
				
				middle=b;
			}else if (a>c) {
				
				middle=c;
			}else {
				middle=a;
			}
		}else {
			
			if(a>c){
				
				middle=a;
			}else if (b>c) {
			
				middle=c;
			}else {
				 middle=b;
			}
			
		}
	}
	
}
