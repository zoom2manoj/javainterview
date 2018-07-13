package com.duplicate;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyhashSet extends AbstractSet implements Set,Cloneable,Serializable{

	Object PRESENT=new Object();
	
	Map<Object, Object> map;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyhashSet(){
		
		map=new HashMap<Object, Object>();
	}
	
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	public boolean add(Object o)
	{
		
		return map.put(o, PRESENT)==null;
	}
		
	
	public static void main(String...s){
		
		MyhashSet mSet=new MyhashSet();
		System.out.println(mSet.add("Deepak"));;
		System.out.println(mSet.add("Ashish"));;
	}
	
}
