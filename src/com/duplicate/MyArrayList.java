package com.duplicate;

import java.util.Arrays;

public class MyArrayList {

	int defaut_capacity=10;
	Object []object;
	int actualSize=0;
	
	public MyArrayList()
	{
		object =new Object[defaut_capacity];
	}
	
	public boolean add(Object o){
		
		
			 if(object.length-actualSize <= 5){
		            increaseListSize();
		        }
				object[actualSize++]=o;
				
				return true;
				
		
	}
	
	public Object get(int index){
		if(index>actualSize){
			
			return new ArrayIndexOutOfBoundsException();
		}else {
			
			return object[index];
		}
		
		
	}
	
	public int size(){
		
		return actualSize;
	}
	
    private void increaseListSize(){
    	object = Arrays.copyOf(object, object.length*2);
        System.out.println("\nNew length: "+object.length);
    }
	
	public static void main(String...s){
		
		MyArrayList mList=new MyArrayList();
		mList.add("Deepak");
		mList.add("Akash");
		mList.add("Shyam");
		mList.add("Amit");
		mList.add("dev");
//		mList.add("kajal");
//		mList.add("kajal");
//		mList.add("kajal");
//		mList.add("kajal");
//		mList.add("kajal");
//		mList.add("kajal");
//		mList.add("kajal");
//		mList.add("kajal");
		/*for(int i=0;i<mList.size();i++){
			
			System.out.println(mList.get(i));
		}*/
		
		
	}
}
