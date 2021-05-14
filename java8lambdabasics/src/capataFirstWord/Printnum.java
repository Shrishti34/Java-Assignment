package capataFirstWord;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Printnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<List<Integer>> dispList = list -> list.stream()
				.forEach(a -> System.out.println(a + " "));

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(9);
		
		dispList.accept(list);
	}
}
	