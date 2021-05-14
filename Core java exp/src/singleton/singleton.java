package singleton;

public class singleton {
	
	private static singleton singleton = new singleton();
	
	private singleton() {}
		public static singleton getInstance() {
			return singleton; 
		}
			
			protected static void demoMain() {
				System.out.println("Demo");
	}
}
