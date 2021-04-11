package com.ArrayConcepts;

public class Reptate_element {

	// how many items a key is present in the array 
	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		
		int arr [] = {10,20,49,79,49,20,49,99,70,78};
		
		int key =49;
		
		int count =0;
		
		int i=0;
		
		while(i< arr.length-1) {
			
			if(key==arr[i]) {
				
				count++;
				}
			i++;
		}
		
		if(count > 0) {
			
			System.out.println( key+"  is present" +  "="  + count  + " times");
		}
		else 
			
			System.out.println(" no present");

}

}