package day3FUnctions;
import java.util.*;

public class paramter {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine();
		String greets=myGreeting(name);
		System.out.println(greets);
		sc.close();
	}
	static String myGreeting(String name)
	{
		String message="Hello "+name;
		return message;
	}
}
