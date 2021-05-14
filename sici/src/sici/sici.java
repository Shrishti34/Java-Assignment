package sici;
import java.util.Scanner;

public class sici {

	public static void main(String[] args) {
		double p,r,t,si,ci;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Principle");
		p = sc.nextDouble();
		
		System.out.println("Enter the rate");
		r = sc.nextDouble();
		
		System.out.println("Enter the time");
		t = sc.nextDouble();
		
		si = (p * r* t)/100;
		ci = p * Math.pow(1.0+r/100.0,t)-p;
		
		System.out.println("Simple Interest = " +si);
		
		System.out.println("Compound Interest =" +ci);

	}

}
