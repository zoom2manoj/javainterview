//FactoryPattern

package com.duplicate;

interface currency{
	
	String getCurrency();
	String getSymbol();
}


class India implements currency{

	@Override
	public String getCurrency() {
		return "Rupee";
	}

	@Override
	public String getSymbol() {
		return "Rs";
	}
	
}

class USA implements currency{
	
	@Override
	public String getCurrency() {
		return "Dollar";
	}

	@Override
	public String getSymbol() {
		return "$";
	}
	
	
}
 class Factory {

	public static currency getCountry(String country){
		
		if("In".equalsIgnoreCase(country)){
			
			return new India();
		}else if ("usa".equalsIgnoreCase(country)) {
			
			return new USA();
		}
		return null;
		
	}
	
}

public class MyCountry{
	
	public static void main(String...s){
		
	currency mCurrency=	Factory.getCountry("usa");
	System.out.println(mCurrency.getCurrency());;
	System.out.println(mCurrency.getSymbol());;
	}
}
