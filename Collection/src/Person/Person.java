package Person;

import java.util.Iterator;
import java.util.TreeSet;



public class Person {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(45);
		tree.add(54);
		tree.add(65);
		tree.add(58);
		tree.add(78);
		
		Iterator<Integer> iterator = tree.iterator();
		System.out.println("Sorting done on bases of weight");
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
		
		}

	}

