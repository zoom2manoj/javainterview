package com.system;

class System1{
	
	static PrintStream1 out;
	
	static{
		
		out=new PrintStream1();
	}
	
}


class PrintStream1{
	
	void println1(String s){
		
		System.out.println(s);
	}
	
	
}


public class SystemDemo {

	public static void main(String...s) {
		
		System1.out.println1("Hello java");
	}
	
}
