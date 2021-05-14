package add;

public class Runnable {

	public static void main(String[] args) {
		
		/***Thread myThread = new Thread(new Runnable () {
			
			@Override
				public void() {
				System.out.println("Printed inside runnable");
			}
		});
		myThread.run();
		*/
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside runnable"));
		myLambdaThread.run();

	}
}
