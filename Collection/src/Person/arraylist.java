package Person;

import java.util.ArrayList;
import java.util.ListIterator;

public class arraylist {

	public static void main(String[] args) {
		
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Sam");
		aList.add("Emma");
		aList.add("Sham");
		aList.add("Julie");
		aList.add("Curee");
		
		ListIterator<String> li = aList.listIterator();
		
		while(li.hasNext()) {
			
			li.next();
		}
		
		System.out.println("ArrayList element in reverse direction are:");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			
		}
	}

}
