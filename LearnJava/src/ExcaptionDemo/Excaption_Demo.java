package ExcaptionDemo;

import java.util.Scanner;

public class Excaption_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" the exception handaling");
		
		try{
			
			int number;
			Scanner sca= new Scanner(System.in);
			
			 number=sca.nextInt();
			 
			 
			System.out.println(number);

			}
		
		// if you default value that time we can use finally keyword
		
		// a class has only one try block and finally block , but n number of catch block we can use in a class
		
		// at the same time try block and catch will not perform at a same time 
		
		// if using the finally with try will will run and if finally with catch will be run 
		catch (Exception e) {
			
			
			System.out.println("somthing is worng  "   +e);
			
			System.out.println("only number are allowed");
		}
		finally {
			
			System.out.println("always exceuted");
		}

}

}