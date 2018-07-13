package com.practise;

interface Country{
	
	String getCurrency();
	String getSymbol();
	
}

class India implements Country{

	@Override
	public String getCurrency() {
		
		return "Rupees";
		
	}

	@Override
	public String getSymbol() {
		
		return "Rs";
	}
	
	
}


class USA implements Country{

	@Override
	public String getCurrency() {
		return "Dollar";
	}

	@Override
	public String getSymbol() {
		return "$";
	}
	
	
}

class FactoryClass{
	
	public static Country getCountry(String mString){
		
		if("In".equalsIgnoreCase(mString)){
			
			return new India();
		}else if ("usa".equalsIgnoreCase(mString)) {
			return new USA();
		}
		
		return null;
		
	}
}

public class FactoryPattern {

	public static void main(String...s){
		
		Country mCountry=FactoryClass.getCountry("");
		System.out.println(mCountry.getCurrency());;
		System.out.println(mCountry.getSymbol());
	}
	
	
}
