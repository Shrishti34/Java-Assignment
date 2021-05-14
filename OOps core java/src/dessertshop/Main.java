package dessertshop;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Role:");
	String role=sc.nextLine();
	if(role.equalsIgnoreCase("Customer")) {
		System.out.println("Enter the Item you want to buy:");
		String item=sc.nextLine();
		System.out.println("Enter the quantity you want to buy:");
	    double quan=sc.nextDouble();
	    if(item.equalsIgnoreCase("candy"))
	    {
	    	Candy c=new Candy(quan);
	    	System.out.println("your bill:"+c.getcost());
	    }
	    else  if(item.equalsIgnoreCase("Cookies"))
	    {
	    	Cookies m=new Cookies(quan);
	    	System.out.println("your bill:"+m.getcost());
	    }
	    if(item.equalsIgnoreCase("icecream"))
	    {
	    	IceCream n=new IceCream(quan);
	    	System.out.println("your bill:"+n.getcost());
	    }
	}
	
	if(role.equalsIgnoreCase("Owner")) {
		//System.out.println("Enter the number Items you want to store:");
		//int n=sc.nextInt();
		System.out.println("Enter the item you want to store:");
		String item1=sc.nextLine();
		System.out.println("Enter the quantity you want to store:");
	    double quan1=sc.nextDouble();

	System.out.println("you stored"+quan1+item1);}
}
}