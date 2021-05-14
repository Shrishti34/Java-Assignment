package add;

public class funcinter {

	public static void main(String[] args) {
		
		MySupplier SupplierFunction = () -> System.out.println("I am Supplier");
		MyConsumer ConsumerFunction = () -> System.out.println("I am Consumer");
		MyPredicate PredicateFunction = () -> System.out.println("I am Predicate");
		MyFunctions FunctionsFunction = () -> System.out.println("I am Function");
		
	}
	
	@FunctionalInterface
	interface MySupplier{
		void s();
	}
	
	@FunctionalInterface
	interface MyConsumer{
		void c();
	}
	
	@FunctionalInterface
	interface MyPredicate{
		void p();
	}
	
	@FunctionalInterface
	interface MyFunctions{
		void f();
	}

}
