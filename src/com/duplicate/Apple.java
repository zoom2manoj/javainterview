package com.duplicate;
import java.util.HashMap;

import java.util.Map;


/*The contract between the hashcode and equals method is:-

1. The hashcode of two equal object shuold be the same.
2.If hashcode of two objects are same then they may or may not be equal.
*/

public class Apple {

	String color;

	public Apple(String color) {
		this.color = color;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Apple mApple=(Apple)obj;
		if(this.color==mApple.color){
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		int hash=3;
		
		hash=7*hash+this.color.hashCode();
		return hash;
	}
	
	
	public static  void main(String...s){
		
		Apple apple1=new Apple("green");
		Apple apple2=new Apple("red");
		
		Map<Apple, Integer> map=new HashMap<Apple, Integer>();
		
		map.put(apple1, 10);
		map.put(apple2, 20);
		
		System.out.println(map.get(new Apple("green")));
		
	}
	
}
