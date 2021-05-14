package result;
import java.util.Scanner;

public class results {
	
	public static void main(String[] args) {
		
		int eng, sci, mat;
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the English marks");
		eng = sc.nextInt();
		
		System.out.println("Enter the Maths marks");
		mat = sc.nextInt();
		
		System.out.println("Enter the Sciencs marks");
		sci = sc.nextInt();
		
		if(eng > 60 && mat > 60 && sci > 60)
			System.out.println("Passed");
		else if((eng > 60 && mat > 60 ) ||( mat > 60 && sci > 60) || (eng > 60 && sci > 60))
		    System.out.println("Passed");
		else if((eng > 60 || mat > 60 || sci > 60) || (eng < 60 || mat < 60 || sci < 60))
			System.out.println("Passed");
			
	}

}
