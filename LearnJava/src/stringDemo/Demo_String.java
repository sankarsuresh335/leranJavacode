package stringDemo;

public class Demo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String an object which represent the sequence of 
		// String is immutable because once created an object we can not able to change 
		// how many ways to create a string  there are two types of by String literal and by new keywords 
	
	String name= "mithunsankar";
	
	System.out.println(name.charAt(5));
	
	System.out.println(name.length());
	
	System.out.println(name.equals("mithun"));
	
	System.out.println(name.equalsIgnoreCase("mithunsankar"));
	
	System.out.println(name.contains("mithun"));
	
	System.out.println(name.substring(6));
	
	String san= "i am'ghh'jjsj'";
	
	String[] java=san.split(",");
	
	for (String string : java) {
		
		System.out.println(string);
		
	}
	
	
	
	}
	
	
	

}
