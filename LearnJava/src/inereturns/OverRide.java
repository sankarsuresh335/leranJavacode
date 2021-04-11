package inereturns;


class a1{
	
	void display() {
		
		System.out.println(" a1 class");
	}
	
}

class b2 extends a1{
	
	
	@Override
	void display() {
		
		System.out.println(" b1 class");
	}
	
	
}

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(" overrider");	
		b2 oj= new b2();
		
		oj.display();
			
			
			
			
		}

	}


