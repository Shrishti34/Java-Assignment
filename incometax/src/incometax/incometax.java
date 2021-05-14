package incometax;
import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		
		double tax = 0, inc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Income");
		inc = sc.nextInt();
		
		if(inc <= 180000)
			tax = 0;
		else if(inc <= 300000)
			tax = (0.1*(inc-180000));
		else if(inc <= 500000)
			tax = (0.2*(inc-300000))+(0.1*100000);
		else if(inc <= 1000000)
			tax = (0.3*(inc-500000))+(0.2*200000)+(0.1*100000);
		
		System.out.println("Amount =" +tax);
		

	}

}
