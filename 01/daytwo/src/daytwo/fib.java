package daytwo;
import java.util.*;
public class fib {
	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a range:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int c=a+b;
			System.out.println(c);
//			System.out.println(b);
			a=b;
			b=b+1;
		}
	}
}
