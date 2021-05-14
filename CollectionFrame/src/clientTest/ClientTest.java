package clientTest;

import java.util.LinkedList;

public class ClientTest {

	public static void main(String[] args) {
		 
		LinkedList<Integer> List = new LinkedList<>();
		List.add(1);
		List.add(2);
		List.add(3);
		List.add(4);
		List.add(5);
		
		List.addFirst(100);
		
		List.addLast(500);
		
		List.add(1,200);
		
		System.out.println(List);

	}

}
