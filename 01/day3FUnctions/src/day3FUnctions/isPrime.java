package day3FUnctions;
import java.util.*;
public class isPrime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		isPrimeFun(n);
	}
	
	public static boolean isPrimeFun(int num)
	{
		int c=2;
		while((c*c)<=num)
		{
			if(num%c==0)
			{
				return false;
			}
			c++;
			
		}
		if(c*c>num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
