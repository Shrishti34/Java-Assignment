package oddlength;

import java.util.ArrayList;

public class OddlenColleRemoveIf {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> CollecLis = new ArrayList<String>();
		
		CollecLis.add("Ram");
		CollecLis.add("Shyam");
		CollecLis.add("Mohan");
		CollecLis.add("Rabi");
		CollecLis.add("Sita");
		
		
		CollecLis.removeIf(n -> (n.length()%2 != 0));
		
		System.out.println("Odd words are removed");
		
		for(String str :CollecLis) {
			System.out.println(str);
		}
			

	}

}
