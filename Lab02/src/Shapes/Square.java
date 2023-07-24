package Shapes;

public class Square {
	private int side;
	public Square(int side)
	{
		this.side=side;
	}
	public float area()
	{
		float area=side*side;
		return area;
	}
	public float perimeter() {
		float perimeter=4*side;
		return perimeter;
	}
}
