package array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		
		int x,i;
		
		int arr[] = {5,10,3,33,24,89,94,100,150,135,1,0,50,99,95};
		int n = arr.length;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be search");
		x = sc.nextInt();
		
		for(i = 0; i<= n; i++)
		{
			if(arr[i] == x);
				System.out.println("Value is found");
				break;	
		}
		
	}

}
