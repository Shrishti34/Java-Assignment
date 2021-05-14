package BankAccount.java;

class Account {
	
		public int fixdep;
		public int cascre;

		public void acc(){
			
			
			System.out.println("Total salary of employees is : emp");
		}
	}


class SavingAcc extends Account{
	
	public void acc(int fixdep) {
		
		
	}

}
===

class CurrentAcc extends Account {
	
public void acc(int cascre) {
		
	
	}

}




public class BankAccount{

	public static void main(String[] args) {
		
		Account e = new Account();
		Account m = new SavingAcc();
		m.fixdep = 5000;
		Account l = new CurrentAcc();
		l.cascre =1000;
		
			e.acc();
			m.acc();
			l.acc();
			
			
			int tot = m.fixdep + l.cascre;
			System.out.println("Total cash in the bank is :"+tot);
			
			

	}

}
