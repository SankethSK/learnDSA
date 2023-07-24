package Shapes;
import Shapes.*;
public class Main {
	public static void main(String[] args)
	{
		Circle c=new Circle(10);
		System.out.println("The area of Circle is: "+c.area());
		System.out.println("The perimeter of Circle is: "+c.perimeter());
		
		Square s=new Square(7);
		System.out.println("The area of Square is: "+s.area());
		System.out.println("The perimeter of Square is: "+s.perimeter());
		
		Triangle t=new Triangle(10,5);
		System.out.println("The area of Triangle is: "+t.area());
//		System.out.println("The perimeter of Triangle is: "+t.perimeter());
		
	}
}
