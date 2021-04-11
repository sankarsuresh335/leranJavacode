package com.ArrayConcepts;

public class Left_shift_array {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		
		int temp=arr[0];
		
		int i=0;
		
		while(i< arr.length-1) {
			
			arr[i]=arr[i+1];
			i++;
		}
		arr[i]=temp;
		
		System.out.println(temp);
		
		for(int j=0; j<arr.length; j++) {
			
			System.out.print(arr[j]);
		}
		
		
		
		

	}

}
