package singleton;

public final class Singleton 
{
private   static Singleton obj=new Singleton();
public String s;
private Singleton() {
	s="hello";
}
public static Singleton getInstance()
{ 
 
  return obj;
}

 }
class Main
{public static void main(String[] args)
{ 
	Singleton x=Singleton.getInstance();
	Singleton y=Singleton.getInstance();
	 System.out.println("String " + x.toString());
	 System.out.println("String " + y.toString());
}}
