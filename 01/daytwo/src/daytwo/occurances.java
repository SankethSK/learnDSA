package daytwo;
import java.util.*;
public class occurances {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int num=n;
		System.out.println("Enter a number to find occurance:");
		int o=sc.nextInt();
		int count=0;
		while(num>0) {
			int rem=num%10;
			if(rem==o) {
				count=count+1;
			}
			num=num/10;
		}
		System.out.println("The num of occurances is:"+count);
	}
}
