package com.ArrayConcepts;

public class Arry_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,20,30,40,50};
		
		int i= arr.length-1;
		
		int temp= arr[i];
		
		
		
		while(i > 0) {
			
			arr[i]=arr[i-1];
			
			i--;
			
	
			
	}
arr[0]=temp;

System.out.println();
	}

}
