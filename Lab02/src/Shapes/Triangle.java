package Shapes;

public class Triangle {
	private int h;
	private int b;
	public Triangle(int h,int b)
	{
		this.h=h;
		this.b=b;
	}
	public float area()
	{
		float area=(float)((0.5)*h*b);
		return area;
	}
}
