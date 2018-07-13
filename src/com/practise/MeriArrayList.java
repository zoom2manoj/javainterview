package com.practise;

import java.util.Arrays;

public class MeriArrayList {

	Object [] storeElements;
	
	int defaul_capacity=10;
	
	int actualSize;
	
	public MeriArrayList(){

		storeElements=new Object[defaul_capacity];
		
	}
	
	public void add(Object o){
		
		
		if(storeElements.length-actualSize<=5){
			
			increaseSize();
		}
		
		storeElements[actualSize++]=o;
		
	}
	
	
	public Object get(int index){
		
		if(index>actualSize){
			
			return new ArrayIndexOutOfBoundsException();
		}else {
			return storeElements[index];
		}
		
		
		
		
	}
	
	public void increaseSize(){
		
		storeElements=Arrays.copyOf(storeElements, storeElements.length*2);
		
	}
	
	
	public int size(){
		
		return actualSize;
		
	}
	
public static void main(String...s){
	
	MeriArrayList mList=new MeriArrayList();
	
	mList.add("Deepak");
	
	
}
	
	
}
