package com.duplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertMapToEntrySet {

	  public static void main(String a[]){

		Map<String, String> map=new HashMap<String, String>();
		  
		Set<Entry<String, String> >mEntry=map.entrySet();
		List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(mEntry);
		
		  
	    }
	
	
}
