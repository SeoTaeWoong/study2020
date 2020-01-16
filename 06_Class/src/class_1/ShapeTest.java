package class_1;

public class ShapeTest {
	static final double PI = 3.141592;
	
	public double area(int base) {
		
		return base*base*PI;
	}
	public double area(int base, int height ) {
		return base*height /2.;
	}
	public double area(int base, int upperbase, int height ) {
		return (base+upperbase)*height /2.;
	}
	
}

