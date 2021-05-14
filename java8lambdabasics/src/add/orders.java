package add;

public class orders {

	public static void main(String[] args) {
		
		
		Order numFunction = (a) -> {
			if(1 == a) return 1;
				return 2;
		};
		System.out.println(numFunction.num(1)+ ": Order price more than 10000");
		System.out.println(numFunction.num(2)+ ": Order status is accepted or rejected");
	}
		
		interface Order{
			int num(int x);
		}

	}