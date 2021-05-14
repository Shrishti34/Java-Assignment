package Employee;


class Employee {
	
	int incent;
	int ovr;
	public void sal() {
		
		
	}

}


class Manager extends Employee{
	
	public void sal(int incent){
		
		System.out.println("Total salary of Lab is :"+ovr);
		
	}
	

}


class Labour extends Employee{
	
	public void sal(int ovr){
		
		System.out.println("Total salary of Lab is :"+ovr);
	}

}

public class Employeesal {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee m = new Manager();
		m.incent = 5000;
		Employee l = new Labour();
		l.ovr =1000;
		
			e.sal();
			m.sal();
			l.sal();
			
			
			int tot = m.incent + l.ovr;
			System.out.println("Total salary of Employee is :"+tot);
			
			

	}

}
