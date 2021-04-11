package inereturns;


 class sub {
	
	
  void run() {
	  
	  System.out.println("i am sub class");
	  
  }	
}
 
 class add extends sub {
	 
	 
	 void sit() {
		 
		 
		 System.out.println("i am aslo sub2");
	 }
	 
 }
 
 class div extends add {
	 
	 void stand() {
		 
		 
		 System.out.println("i am satnding sub 3");
	 }
	 
 }

public class DemoInaternace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add ad= new add();
		
		div di= new div();
		
		di.run();
		di.sit();
		di.stand();
		
		
		
		

	}

}
