package Arrays;
import java.util.*;
public class Pyramid{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of n:");
		int n=in.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)	
		{
			for(int j=1;j<=i;j++)
			{
				
				if(i!=j) {
					System.out.print(k+"*");
					k++;
				}
				else {
					System.out.print(k);
					k++;
				}
			}
			System.out.println();
		}
		k=k-n;
		int c=n-1;
		for(int i=n;i>0;i--)	
		{
			for(int j=i;j>0;j--)
			{
				
				if(j==1) {
					System.out.print(k);
					k++;
				}
				else {
					System.out.print(k+"*");
					k++;
				}
			}
			System.out.println();
			k=k-i-c;
			c--;
		}
		in.close();
	}
}