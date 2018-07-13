package com.threading;

class Thread1 extends Thread{
	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Thread1 is Running.....  "+i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}


class Thread2 extends Thread{
	
	@Override
	public void run() {
		
	for (int i = 0; i < 10; i++) {
		System.out.println("Thread2 is Running.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

public class Run {
	
	public static void main(String...s) throws InterruptedException{
		
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		Thread1 t3=new Thread1();
		
		t1.start();
		t2.start();
		t2.join();
		t3.start();
		
		
		
		
		
	}

	
	
}
