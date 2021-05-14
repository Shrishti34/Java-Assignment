package findarms;

import java.util.Scanner;

public class Findarms {

	public static void main(String[] args) {
    int check, rem, sum = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of value");
		int str = sc.nextInt();
		
		System.out.println("Enter the range of value");
		int fin = sc.nextInt();
		
		for(int i = str; i < fin; i++)
		{
			check = i;
			while(check!=0)
			{
			rem = check % 10;
			check = check /10;
			sum = sum + (rem*rem*rem);
			}

		if(sum == i)
			System.out.println(+i+" is Armstrong Number");
		}

	}

}
