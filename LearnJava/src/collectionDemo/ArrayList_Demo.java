package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// convert to array List to String Array 
		
		List<String>lt= new ArrayList<>();
		lt.add("hi");
		lt.add("i am sankar");
		lt.add("i am minthun");
		lt.add("i am sasikala");
		lt.add("i am hee");
		
		System.out.println(lt.get(2));
		
		
		Iterator<String> jsn=lt.iterator();
		
		for (String string : lt) {
			
			System.out.println(string);
		
		}
		

	}

}
