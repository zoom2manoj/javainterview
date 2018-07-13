package com.practise;

interface Icecream{
	
	String makeIcecream();
}

class SimpleIcecream implements Icecream{

	@Override
	public String makeIcecream() {
		return "simpeIcecream";
	}
	
}

abstract class DecoratorPattern implements Icecream{
	
	Icecream mIcecream;
	
	public DecoratorPattern(Icecream mIcecream){
		
		this.mIcecream=mIcecream;
	}

	@Override
	public String makeIcecream() {
		return mIcecream.makeIcecream();
	}
	
	
	
}


class Nutydecorator extends DecoratorPattern{

	public Nutydecorator(Icecream mIcecream) {
		super(mIcecream);
		
	}
	
	@Override
	public String makeIcecream() {
		return mIcecream.makeIcecream()+" +Add Nuts";
	}
	
	
}


class HoneyDecorator extends DecoratorPattern{

	public HoneyDecorator(Icecream mIcecream) {
		super(mIcecream);
	}
	
	@Override
	public String makeIcecream() {
		return mIcecream.makeIcecream()+" +Add Honey";
	}
}

public class Decorator {

	
	public static void main(String[] args) {
		Icecream mIcecream=new HoneyDecorator(new Nutydecorator(new SimpleIcecream()));
		 System.out.println(mIcecream.makeIcecream());
	}
}
