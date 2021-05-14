package oddlength;

import java.util.ArrayList;

public class Collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<String> CollecLis = new ArrayList<String>();
		
		CollecLis.add("Ram Prasad");
		CollecLis.add("Shyam Singh");
		CollecLis.add("Mohan Kumar");
		CollecLis.add("Rabi Sahu");
		CollecLis.add("Sita Saxena");
		
		CollecLis.stream()
		.map(s -> s.substring(0,1))
		.forEach(s -> System.out.println(s));
		
		}
}