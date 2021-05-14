package shape;


abstract class Shapes{
	
	private String name;

	public Shapes() {
		this.name = "Unknown shape";
	}
	
	public abstract void draw();
	
}

class Line extends Shapes{
	
	private double len;
	
	public Line(double len) {
		this.len = len;
	}
	
	public void draw() {
		
		System.out.println("Drawing a line....");
	}
}

class Cicle extends Shapes{
	
private double rad;
	
	public Cicle(double rad) {
		this.rad = rad;
	}
	
	public void draw() {
		
		System.out.println("Drawing a cube....");
	}
}

class Rectangle extends Shapes{
	
	private double w;
	private double h;
	
	public Rectangle(double w, double h) {
	
		this.w = w;
		this.h = h;
	}
	
	public void draw() {
		
		System.out.println("Drawing a Rectangle....");
	}
}

class ShapesUtil{
	public static void drawShapes(Shapes[] s) {
		for(int i=0; i < s.length;i++) {
			s[i].draw();
		}
	}
}

public class Shape {

	public static void main(String[] args) {
		
		Shapes[] s = new Shapes[3];
		s[0] = new Line(5.2);
		s[1] = new Cicle(5.2);
		s[2] = new Rectangle(2.0,4.0);
		
		ShapesUtil.drawShapes(s);
		
		

	}

}
