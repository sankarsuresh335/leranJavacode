package constuctor;


 class animal{
	 
	 String name ;
	 String color;
	 int hight ;
	 String brid;
	 
	 public animal(String name ,String color, int hight) {
		 
		 this.name=name;
		 
		 this.color=color;
		 
		 this.hight=hight;
		 
		
	}
	 void specMethod() {
		 
		 
		 System.out.println( "the sepc name of the dog");
	 }
	
	
	
}

public class Con_Dog {
	
	private static int i ;
	
	private static String s;
	
	
	
	
public Con_Dog(int i , String s) {
	
	this .i =i;
	
	this.s= s;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal rajapalayam= new animal("hutch", "wight", 15);
		
		Con_Dog con= new Con_Dog(25,"hello");
		
		System.out.print(con.i);
		System.out.print(con.s);
		
		
		
		
		
		rajapalayam.specMethod();
		System.out.println(rajapalayam.hight);
		rajapalayam.color="wight";
		System.out.println(rajapalayam.color);
		

	}

}
