package com.ArrayConcepts;

public class Reverse_Array {
	
	// array reverse method prog

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		
		int j= arr.length-1;
		 
		int i=0;
		System.out.println(" before reversiing :");
		
		for(int k=0 ; k<arr.length; k++) {
			
			System.out.print(arr[k]+ " ");
		}
		 
		 while(i<j) {
			
			int temp=arr[i];
			
			arr[i]=arr[j];
			
			arr[j]=temp;
			
			i++;
			j--;
			//i=i+1;
			//j=j-1;
			 
	 }
		System.out.println();
		System.out.println("aftrer the reversing");
		
		for(int k=0 ; k<arr.length; k++) {
			
			System.out.print(arr[k] + " ");
		}
			
		}

	

}
