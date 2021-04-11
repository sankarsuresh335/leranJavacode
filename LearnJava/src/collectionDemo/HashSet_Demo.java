package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>hash= new HashSet<>();
		
		hash.add("sandy");
		hash.add("sasikala");
		hash.add("Mithun");
		hash.add("canedo");
		hash.add("canedo");
		
		
		Iterator<String> it= hash.iterator();
		
		System.out.println(" it is showing the hashset");
		
		for (String hashesvalue : hash) {
			
			System.out.println(hashesvalue);
			
			if(hashesvalue.equals("sandsdhksd")) {
				
				System.out.println("it is ok");
			
			}
			
			
		}

	}

}
