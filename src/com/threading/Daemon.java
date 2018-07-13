package com.threading;

public class Daemon extends Thread{

	@Override
	public void run() {
		
		System.out.println("Thread name  "+ Thread.currentThread().getName());
		System.out.println("daemon "+Thread.currentThread().isDaemon());
	}
	
	
	public static void main(String...s){
		
		Daemon t1=new Daemon();
		Daemon t2=new Daemon();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		
		
	}
}
