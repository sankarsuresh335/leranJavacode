package com.ArrayConcepts;

public class Liner_search {
	
	// given value is present or not in the given array list 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= { 10,35,45,67,89,47,99,38,35,35};
		
		 int key = 7;
		 
		 int count =0;
		 
		 int i=0;
		 
		 while(i <arr.length) {
			 
			 
			 if(key==arr[i]) {
				 
				 System.out.println(" the key value is present" + i);
				 count++;
				  break;
			 }
			  i++;			
		 }	
		
		 if(i == arr.length) 
			 
			 System.out.println( key +" it is not present ");
		 }
	
}