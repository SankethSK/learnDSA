package Shapes;

public class Circle {
	private int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public float area() {
		float area=(float) (3.14*radius*radius);
		return area;
	}
	public float perimeter()
	{
		float perimeter=(float)(2*3.14*radius);
		return perimeter;
	}
}
