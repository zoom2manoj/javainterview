package com.duplicate;

public class Tiger {

	private String color="";
	private String stripePattern="";
	private String height="";
	
	private Tiger(String color, String stripePattern, String height) {
		this.color = color;
		this.stripePattern = stripePattern;
		this.height = height;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public String getStripePattern() {
		return stripePattern;
	}


	public void setStripePattern(String stripePattern) {
		this.stripePattern = stripePattern;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}
	
	@Override
	public boolean equals(Object arg0) {
		if (arg0 == null || arg0.getClass() != getClass()) {
		      return false;
		    } 
		Tiger bengaliTiger2=(Tiger)arg0;
		if(this.getColor()==bengaliTiger2.getColor()&& this.getStripePattern()==bengaliTiger2.getStripePattern()){
			System.out.println(this.getHeight());
			return true;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		
		int hash=3;
		
		hash=7*hash+this.color.hashCode();
		hash=7*hash+this.stripePattern.hashCode();
		
		return hash;
	}
	
	public static void main(String...s){
		
		Tiger bengaliTiger1=new Tiger("Red", "Dense", "4");
		Tiger bengaliTiger2=new Tiger("Red", "Dense", "6");
		Tiger siberianTiger=new Tiger("Yellow", "Sparse", "6");
		
		 System.out.println("bengalTiger1 and bengalTiger2: "
			        + bengaliTiger1.equals(bengaliTiger2));
		 
		 System.out.println("bengalTiger1 and siberianTiger: "
			        + bengaliTiger1.equals(siberianTiger));
			 
			    System.out.println("bengalTiger1 hashCode: " + bengaliTiger1.hashCode());
			    System.out.println("bengalTiger2 hashCode: " + bengaliTiger2.hashCode());
			    System.out.println("siberianTiger hashCode: "
			        + siberianTiger.hashCode());
		
	}
	
}
