package StandardFunctionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.Collections;

public class StandardFunctionalInterface {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charle", "Dicknes", 79),
				new Person("Joe", "Carrooll", 70),
				new Person("Sam", "Lewis", 72),
				new Person("Charlotte", "Dick", 50),
				new Person("Manthan", "Arnold", 45)
				);
		
		//Step 1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));
		
		//Step 2: Create a method that print all elements in the list
		System.out.println("Printing all persons");
		printConditionally(people, p -> true, p -> System.out.println(p));
		
		//Step 2: Create a method that print all people that have last name beginning with c
		System.out.println("Printing all persons with the lastName beginning with C");
		printConditionally(people, p -> p.getLastname().startsWith("C"), p -> System.out.println(p));
		
		System.out.println("Printing all persons with the firstName beginning with C");
		printConditionally(people, p -> p.getFirstname().startsWith("C"), p -> System.out.println(p.getFirstname()));

	}
	
	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
