package InterFace;


interface car{
	
	void myemthod();
	void youmethod();
	void ourmethod();
	
	String naame= "sandy;";
	
}

interface flight extends car,ship {
	
	void myemthod1();
	void youmethod1();
	void ourmethod1();
	
	String naame= "sandy;";
	
}

interface ship  {
	
	void myemthod1();
	void youmethod1();
	void ourmethod1();
	
	String naame= "sandy;";
	
}


class bmw implements car,flight,ship {

	@Override
	public void myemthod() {
		System.out.println("i am the boss");
		
	}

	@Override
	public void youmethod() {
		
		System.out.println("i am not boss");
	}

	@Override
	public void ourmethod() {
		System.out.println("i am not boss");
		
	}

	@Override
	public void myemthod1() {
		// TODO Auto-generated method stub
		System.out.println("i am not boss");
	}

	@Override
	public void youmethod1() {
		// TODO Auto-generated method stub
		System.out.println("i am not boss");
	}

	@Override
	public void ourmethod1() {
		// TODO Auto-generated method stub
		System.out.println("i am not boss");
	}
	
	
	
}




// for the interface to achieve 100% abstraction 

// to achieve multiple inheritance

// interface is class but not a class
// normally will create in class has , variable , method and constuctor
// not possibleto create object

// how a class can use the interface
// Using the implements keywords

// how a interface use onther interface 

// Using the extends Keywords

public class In_demo {

	public static void main(String[] args) {
		System.out.println("interface class");
		
		car ca= new bmw();
		
		flight fa= new bmw();
		
		fa.myemthod1();
		
		ca.myemthod();
		ca.youmethod();
		ca.ourmethod();
		

	}

}
