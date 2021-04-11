package inereturns;

class a{
	
	a(){
		
		System.out.println("i am aaa");
	}
	
	a(int i){
		
		System.out.println(" i am the a");
	}
	
	a(int i , int b){
		
		
		System.out.println("i am aaaaa");
	}
	
	
}

class b extends a{
	
	b(){
		
		System.out.println(" i am b");
	}
	
	b(int i, int b){
		
		super(i,b);
		
		System.out.println(" i am the b");
		
	}
	
}

class c{
	
	c(){
		
		
	}
	
	
}


public class Demo_Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" super keywprd");
		
		b obj= new b(30,15);
		
		
		

	}

}
