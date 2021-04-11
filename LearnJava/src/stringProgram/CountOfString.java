package stringProgram;

public class CountOfString {

	public static void main(String[] args) {
		
		// Count first letter or character in a String 
		
		String san= "mithunvijayasekaranmmmmm";
		
			char first=san.charAt(0);
			
			int count = 1;
			
			for(int i=1; i< san.length(); i++) {
				
				if(first==san.charAt(i)) 
					
				count++;							
				}
			
			System.out.println(count);

	}

}
