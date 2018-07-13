package com.duplicate;

import java.util.ArrayList;
import java.util.List;
 
public class DuplicateNumber {
 
    public  boolean bruteforce(List<Integer> numbers) {
    	
        for (int i = 0; i < numbers.size(); i++) {
        	
            for (int j = 0; j < numbers.size(); j++) {
            	
                if (numbers.get(i)==numbers.get(j) && i != j) {
                	
                	System.out.println("Duplicate Number: " + numbers.get(i));
                	
                	
                    return true;
                }
            }
        }
        return false;
    }


	
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=1;i<30;i++){
            numbers.add(i);
        }
        //add duplicate number into the list
        numbers.add(20);
        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.bruteforce(numbers));
    }
}
