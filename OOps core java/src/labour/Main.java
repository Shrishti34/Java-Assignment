package labour;

public class Main {
	 public static void main(String[] args) {
		 Manager m1=new Manager(1,"Tom" ,37000);
		 Manager m2=new Manager(2,"Haris" ,90000);
		 Labour l1=new Labour(1,"Adam" ,40000);
		 Labour l2=new Labour(2,"John" ,88000);
		 System.out.println(l1.getSalary()+l2. getSalary()+m1.getSalary()+m2.getSalary());
	 }
	 

}