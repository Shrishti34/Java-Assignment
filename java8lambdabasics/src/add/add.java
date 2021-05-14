package add;

public class add {

	public static void main(String[] args) {
		
		Myadd addFunction = (a,b) -> (a+b);
		System.out.println(addFunction.add(10,20));
		MySub SubFunction = (a,b) -> (a-b);
		System.out.println(SubFunction.Sub(10,20));
		MyMul MulFunction = (a,b) -> (a*b);
		System.out.println(MulFunction.Mul(10,20));
		MyDiv DivFunction = (a,b) -> {
		if(b==0) return 0;
				return a/b;
		};
		System.out.println(DivFunction.Div(10,20));
		
	}
		interface Myadd{
			int add(int x, int y);
		}

	interface MySub{
		int Sub(int x, int y);
	}
	
	interface MyMul{
		int Mul(int x, int y);
	}
	
	interface MyDiv{
		int Div(int x, int y);
	}

	}
