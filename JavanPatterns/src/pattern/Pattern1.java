package pattern;
import java.util.*;
public class Pattern1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		int[][] arr=new int[n][];
		System.out.println("Enter the Size of rows:");
		
		for(int i=0;i<arr.length;i++)
		{
			int m=sc.nextInt();
			arr[i]=new int[m];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
