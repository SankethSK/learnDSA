package daytwo;
import java.util.*;
public class ifelse {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the salary for bonous:");
		int a= sc.nextInt();
		if(a>10000)
		{
			a=a+1000;
		}
		else {
			a=a+500;
		}
		System.out.println("After bonous"+a);
	}
}
