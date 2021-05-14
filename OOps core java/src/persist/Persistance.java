package persist;

public abstract class Persistance {

abstract void persist();
}
class Database extends Persistance{
	
	@Override
	void persist() {
		System.out.println("This is Database persistance");
	}
}
class File extends Persistance{
	@Override
	void persist() {
		System.out.println("This is File persistance");
	}
	
}
class Pers{
	
	public static void main(String[] args) {
		Persistance a = new Database();
		Persistance b = new File();
		a.persist();
		b.persist();
		
		
	}
}