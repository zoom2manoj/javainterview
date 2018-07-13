package com.duplicate;
//Singleton
//Factory
//Fascade
//Decorator
//Composite
interface MicroWave {
	
	void startHeating();
}


class Transformer implements MicroWave{

	@Override
	public void startHeating() {
		
		System.out.println("Transferring current"); 
	}
}


class Heater implements MicroWave{

	@Override
	public void startHeating() {
		
		System.out.println("Heating start");
	}
	
}

class Lighter implements MicroWave{

	@Override
	public void startHeating() {
		
		System.out.println("Lightening");
	}
}


class FascadeStarter {
	
	Transformer mTransformer;
	Heater mHeater;
	Lighter mLighter;
	
	public FascadeStarter(){
		
		mTransformer=new Transformer();
		mHeater=new Heater();
		mLighter=new Lighter();
		
	}
	
	public void startMicroWave(){
		mTransformer.startHeating();
		mHeater.startHeating();
		mLighter.startHeating();
		
	}
	
}

public class FascadePattern {

	public static void main(String...s){
		
		new FascadeStarter().startMicroWave();
		
	}
	
}
