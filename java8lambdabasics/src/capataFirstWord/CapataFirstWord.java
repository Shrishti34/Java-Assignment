package capataFirstWord;

import java.util.LinkedList;

public class CapataFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		LinkedList<String> CollecLis = new LinkedList<String>();
		
		CollecLis.add("ram prasad");
		CollecLis.add("shyam singh");
		CollecLis.add("mohan kumar");
		CollecLis.add("rabi sahu");
		CollecLis.add("sita saxena");
		
		CollecLis.replaceAll(name -> (name.toUpperCase()));
		
		for(String name : CollecLis)
		
		System.out.println("Name of the list = " + name);
				

	}

}
