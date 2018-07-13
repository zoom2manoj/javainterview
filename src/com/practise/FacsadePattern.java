package com.practise;


interface Microwave{
	
	void startHeating();
}


class Transformer implements Microwave
{

	@Override
	public void startHeating() {
		
		System.out.println("Transformer started");
	}
	
	
}

class Heater implements Microwave
{

	@Override
	public void startHeating() {
		
		System.out.println("heating started");
	}
	
	
}

class Lightening implements Microwave{

	@Override
	public void startHeating() {
		
		System.out.println("light blow");
	}
	
	
}

class FascadeStarter{
	
	Transformer mTransformer;
	Heater mHeater;
	Lightening mLightening;
	
	public FascadeStarter(){
		
		
		mTransformer=new Transformer();
		mHeater=new Heater();
		mLightening=new Lightening();
		
	}
	
	void starter(){
		
		mTransformer.startHeating();
		mHeater.startHeating();
		mLightening.startHeating();
		
	}
	
}
public class FacsadePattern {

public static void main(String...s){
		
		new FascadeStarter().starter();
	}
}
