package com.practise;


public class Practise {

	private static void getbinary(int number){
		
	int index=0;
	int binary[]=new int[25];
	
	while (number!=0) {
		
	binary[index++]=number%2;
	number=number/2;
	}
		
	for(int i=index-1;i>=0;i--){
		
		System.out.print(binary[i]);
	}
		
	}
	
	private static boolean checkBinary(int number){
		
		while (number!=0) {
			
			int rem=number%10;
			number=number/10;
			
			if(rem>1){
				
			return	false;
			
			}
		}
		
		return true;
	}
	
	private static void bubble(int arr[]){
		
		int temp=0;
		
		for(int m=arr.length;m>=0;m--){
			
			for (int i=0;i<arr.length-1;i++){
				
				if(arr[i]>arr[i+1]){
					
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+", ");
		}
		
	}
	
	
	private static boolean checkDuplicacy(int arr[]){
		
		for (int i = 0; i < arr.length; i++) {
			
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i]==arr[j] && i!=j) {
					System.out.println("Duplicate number= "+arr[i]);
					return true;
				}
				
				
			}
		}
		
		return false;
		
	}
	
	private static void fibbo(){
		
		int febcount=15;
		int feb[]=new int[febcount];
		
		feb[0]=0;
		feb[1]=1;
		
		for(int i=2;i<febcount;i++){
			
			feb[i]=feb[i-1]+feb[i-2];
		}
		
		for (int i = 0; i < feb.length; i++) {
			
			System.out.print(feb[i]+", ");
		}
		
	}
	
	private static void intersection(){
		int arr1[]={2,5,66,44,14,84,24,14,54,5,44,2};
		int arr2[]={5,99,45,44,87,84,2};
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if(arr1[i]==arr2[j]){
					
					System.out.println(arr1[i]);
				}
			}
		}
	}
	static int sum=0;
	private static int numberSum(int number){
	
		if(number==0){
			
			return sum;
		}else {
			sum=sum+number%10;
			numberSum(number/10);
		}
		
		return sum;
		
		
	}
	
	// 1+2+3=6
	private static boolean isPerfect(int number){
		
		int sum=0;
		for(int i=1;i<number;i++){
			
			if(number%i==0){
				
				sum=sum+i;
			}
			
			
			if(sum==number){
				
				return true;
			}
			
		}
		return false;
		
		
	}
	
	//2,3,5,7,11,13
	private static boolean isPrime(int number){
		
		for (int i = 2; i <number; i++) {
			
			if(number%i==0){
				return false;
			}
			
		}
		
		return true;
	}
	
	private static int primeSum(){
		
		int count=0;
		int sum=0;
		int number=2;
		
		while(count<1000){
			
			if(isPrime(number)){
				
				sum=sum+number;
				count++;
			}
			
			number++;
		}
		
		return sum;
	}
	
	
	private static int reversenumber(int number){
		
		int rev=0;
		
		while(number!=0){
			
			rev=(rev*10)+(number%10);
			number=number/10;
		}
		
		return rev;
	}
	
	
	private static String revString(String s){
		String rev = "";
		if(s.length()==0){
			return rev;
		}
		
		for (int i = s.length()-1; i >=0; i--) {
			
			rev=rev+s.charAt(i);
		}
		
		return rev;
		
		
	}
	
	
	private static int getNumberToString(String number){
		int sum=0;
		int asciiZero=(int)'0';
		
		char[] arr=number.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			sum=(sum*10)+((int)arr[i]-asciiZero);
			
		}
		
		return sum;
	}
	
	private static int countWords(String s){
		
		int count=0;
		
		if(s.charAt(0)!=0){
			
			count++;
		}
		
		for(int i=1;i<s.length();i++){
			
			
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
				
				count++;
			}
			
		}
		
		return count;
		
	}
	
	private static boolean binarySearch(int arr[],int number){
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end){
			
			int mid=(start+end)/2;
			
			if(arr[mid]==number){
				System.out.println(mid);
				return true;
			}else{
				if(number>arr[mid]){
					
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			
			
			
		}
		return false;
	}
	
	private static int getDecimalFromBinary(int number){
		
		int sum=0;
		int power=0;
		while(number!=0){
			
			int rem=number%10;
			number=number/10;
			sum=(int) (sum+rem*Math.pow(2, power));
			power++;
		}
		
		
		return sum;
		
		
	}
	
	private static boolean powerOfTwo(int number){
		
		int result=1;
			while(number>result){
				result=result*2;
				
				if(number==result){
					return true;
				}
			}
			
		
		return false;
		
		
	}
	
	
	public static void main(String...s){

//	getbinary(25);
//	System.out.println(checkBinary(1100111));;
//	bubble(new int[]{23,44,1,6,67,43,23,5,8});
//	System.out.println(checkDuplicacy(new int[]{23,44,1,6,67,43,23,5,8}));
//	fibbo();
//	intersection();
	
//	System.out.println(numberSum(2311));
//	System.out.println(isPerfect(28));
//	System.out.println(isPrime(7));
//	System.out.println(primeSum());
//	System.out.println(reversenumber(428732));
//	System.out.println(revString(" "));
//		System.out.println(getNumberToString("1254"));
//		System.out.println(countWords(""));
//		System.out.println(binarySearch(new int[]{2,7,12,20,25,37,40},40));
//		System.out.println(getDecimalFromBinary(11001));
		System.out.println(powerOfTwo(14));
}
}
