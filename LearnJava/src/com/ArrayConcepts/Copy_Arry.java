package com.ArrayConcepts;

public class Copy_Arry {
	
	//create a array using the existening area

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		
		int b[]=new int[a.length] ;
		
		int i=0;
		
		int j=a.length-1;
		
		while(i <a.length) {
			
			b[i]=a[j];
			
			i++;
			j--;
		}
		
		for(int k=0; k<b.length ;k++) {
			
			System.out.print( b[k]  + " " );
		}
		
		
		
		
		
		

}

}