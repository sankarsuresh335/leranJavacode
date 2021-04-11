package abreactDemo;


 abstract class Demo{
	
	
	 void run() {
		 
		 
		 System.out.println("i am abstact class");
	 }
	
	 abstract void mymethod() ;
	
 }
	 
	class demo1 extends Demo {

		@Override
		void mymethod() {
			System.out.println("i am implement method abstact ");
			
		}
		
		
		}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// it is not possible to create obj in abstract class
		// we can mot create a object for abrest class but extend class can be create a object
		// concrete class means which class is going extend abstact class is called concrete class
		// here demo1 is extend Demo class is demo1 is the concreate class 
		// which out abstract keyword does not class abstract class so need to check class having abstact keywords
		System.out.println("i am abstact menthod");
		
		Demo de= new demo1();
		
		de.run();
		de.mymethod();

	}

}
 
 
