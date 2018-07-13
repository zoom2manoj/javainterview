package com.duplicate;

public class Binary {

	
/*	public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
     
    public static void main(String a[]){
    	Binary dtb = new Binary();
        dtb.printBinaryFormat(25);
    }*/
	// number=25;
	private void getBinary(int number){
		
		int binary[]=new int[25];
		int index=0;
			
		while(number!=0){
			
			binary[index++]=number%2;
			
			number=number/2;
			
		}
		
		
		for(int i=index-1;i>=0;i--){
			
			System.out.print(binary[i]);
		}
		
		
	}
	
	
public static void main(String...s){

	new Binary().getBinary(25);
}

}
